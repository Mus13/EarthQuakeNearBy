/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;


/**
 *
 * @author Mustapha
 */

public class EarthQuakes {
    //private String type;
    //private MetaData metadata; 
    //private double[] bbox;
    private Feature[] features;

    /*public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public void setBbox(double[] bbox) {
        this.bbox = bbox;
    }
*/
    public void setFeatures(Feature[] features) {
        this.features = features;
    }

    /*public MetaData getMetadata() {
        return metadata;
    }

    public double[] getBbox() {
        return bbox;
    }*/

    public Feature[] getFeatures() {
        return features;
    }
    
}
