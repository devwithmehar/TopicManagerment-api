package com.managementtool.apidata.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import com.managementtool.apidata.topic.Topic;


@Entity
public class Course {
    
    @Id
    private String id;
    private String name;
    private String desciption;

    @ManyToOne
    private Topic topic;

    public Course(){

    }

    public Course(String id, String name, String description, String topicId){
        this.id = id;
        this.name = name;
        this.desciption = description;
        this.topic = new Topic(topicId, "", "");
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

    public Topic getTopic(){
        return this.topic;
    }

    public void setTopic(Topic topic){
        this.topic = topic;
    }
}
