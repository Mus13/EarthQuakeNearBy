package com.mycompany.mavenproject2;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.*;
import javax.ws.rs.QueryParam;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    private Gson gson ; 
    private EarthQuakes earthQuakes;
    private ArrayList<EarthQuakeCity> earthQuakesNearBy=new ArrayList<EarthQuakeCity>();
    
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@QueryParam("lat") double lat,@QueryParam("lon") double lon) {
        
        String result;
        int i,j,arrayLimit;
        
        //Test if the given latitude and longitude are valid
        try 
        { 
            // checking valid integer using parseInt() method 
            Double.parseDouble(lat+"");
            Double.parseDouble(lon+"");
        }  
        catch (NumberFormatException e)  
        { 
            return "The data given is not valid !"; 
        } 
        if(lat<-90||lat>90||lon<-180||lon>180){
             return "The data given is not valid !";
        }
        //Creating a client
        Client client=ClientBuilder.newClient();
        //Reading the data from given by the web service
        WebTarget target=client.target("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.geojson");
        result=target.request(MediaType.APPLICATION_JSON).get(String.class);
        gson = new Gson();
        earthQuakes=gson.fromJson(result, EarthQuakes.class);
        int featuresSize=earthQuakes.getFeatures().length;
        
        featuresSize--;
        
        //Putting the earthquakes's details and the distance in an array list to make the manipulation easier and clean
        for(i=0;i<featuresSize;i++){
            earthQuakesNearBy.add(new EarthQuakeCity(earthQuakes.getFeatures()[i].getProperties().getTitle(),
                                                     earthQuakes.getFeatures()[i].getGeometry().getCoordinates()[0],
                                                     earthQuakes.getFeatures()[i].getGeometry().getCoordinates()[1],
                                                     DistanceCalculator.distance(lat,
                                                                                lon, 
                                                                                earthQuakes.getFeatures()[i].getGeometry().getCoordinates()[1], 
                                                                                earthQuakes.getFeatures()[i].getGeometry().getCoordinates()[0])
                                                     ));
        }
        
        //Sorting the list in an ascending sort
        Collections.sort(earthQuakesNearBy, new Comparator<EarthQuakeCity>(){
            @Override
            public int compare(EarthQuakeCity o1, EarthQuakeCity o2) {
                
                return (int)(o1.getDistance()- o2.getDistance()) ;
            }
        });
        
        //I wanted to add this variable in case that number of earthquakes are less than 10(it's almost impossible)
        arrayLimit=earthQuakesNearBy.size();
        if(arrayLimit>10)
            arrayLimit=10;
       
        //Here is a loop that removes the earthquakes that happened in the same exact place
        for(i=0;i<arrayLimit;i++){
            for(j=i+1;j<arrayLimit;j++){
                if((earthQuakesNearBy.get(i).getLat()==earthQuakesNearBy.get(j).getLat())&&(earthQuakesNearBy.get(i).getLon()==earthQuakesNearBy.get(j).getLon())){
                    earthQuakesNearBy.remove(j);
                    i--;
                    j=arrayLimit;
                    
                }       
            }
        }
        
        //remove unnecessary objects because we need only 10 or less(in case the list contains less than 10 earthquakes) in the list
        for(i=arrayLimit;i<earthQuakesNearBy.size();)
            earthQuakesNearBy.remove(i);
        
        result="";
        for(i=0;i<arrayLimit;i++){
            result=result+earthQuakesNearBy.get(i).getTitle()+"  ||  "+earthQuakesNearBy.get(i).getDistance()+"\n";
        }
        
        return result;
    }
}
