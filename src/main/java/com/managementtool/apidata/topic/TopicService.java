package com.managementtool.apidata.topic;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    private List<Topic> topics = new ArrayList<>( Arrays.asList(
        new Topic( "Lean Java", "For DSA, for leaning high scalable language"),
        new Topic( "Spring Framework", "Helps me to build application for Desktop, Web, Microservices"),
        new Topic( "React", "React is the javascript Libarary")
    ));

    public List<Topic> getAllTopics(){
        return this.topics;
    }

    // Time Complexity will be O(n)
    public Topic getTopic(String id){
      return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic){
       for(int i = 0; i < topics.size(); i++){
         Topic t = topics.get(i);
         if(t.getId().equals(id)){
            topic.setId(id);
            topics.set(i,topic);
            return;
         }
       }
    }

    public void deleteTopic(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }
}
