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
class MetaData {
    
    private long generated;
    private String url;
    private String title;
    private String api;
    private double count;
    private double status;

    public void setGenerated(long generated) {
        this.generated = generated;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    

    public long getGenerated() {
        return generated;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getApi() {
        return api;
    }

    public double getCount() {
        return count;
    }

    public double getStatus() {
        return status;
    }
    
}
