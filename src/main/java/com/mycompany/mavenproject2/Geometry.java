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
class Geometry {
    
   // private String type;
    private double[] coordinates;

  /*  public void setType(String type) {
        this.type = type;
    }
*/
    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    
    
   /* public String getType() {
        return type;
    }*/

    public double[] getCoordinates() {
        return coordinates;
    }
    
    
}
