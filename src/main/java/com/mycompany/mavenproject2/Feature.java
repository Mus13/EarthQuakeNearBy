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
class Feature {
    
    //private String type;
    private Properties properties;
    private Geometry geometry;
    //private String  id;

    /*public void setType(String type) {
        this.type = type;
    }
*/
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

   /* public void setId(String id) {
        this.id = id;
    }

    
    
    public String getType() {
        return type;
    }
*/
    public Properties getProperties() {
        return properties;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    /*public String getId() {
        return id;
    }*/

    
}
