package com.managementtool.apidata.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    
    @Id
    private String id;
    private String name;
    private String desciption;

    public Course(){

    }

    public Course(String id, String name, String description){
        this.id = id;
        this.name = name;
        this.desciption = description;
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
        return this.desciption;
    }

    public void setDescription(String desciption){
        this.desciption = desciption;
    }
}
