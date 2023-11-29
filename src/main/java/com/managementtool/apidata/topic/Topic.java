package com.managementtool.apidata.topic;

import java.util.UUID;

public class Topic {
    
    private String id;
    private String name;
    private String description;

    public Topic(String name, String description){
        super();
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
      return  this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
