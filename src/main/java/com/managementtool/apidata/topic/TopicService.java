package com.managementtool.apidata.topic;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService  {

    @Autowired
    private TopicRepository topicRepository;
    
    private List<Topic> topics = new ArrayList<>( Arrays.asList(
        new Topic( "1", "Lean Java", "For DSA, for leaning high scalable language"),
        new Topic( "2","Spring Framework", "Helps me to build application for Desktop, Web, Microservices"),
        new Topic("3", "React", "React is the javascript Libarary")
    ));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics:: add);
        return topics;
    }

    // Time Complexity will be O(n)
    public Topic getTopic(String id){
      return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
       for(int i = 0; i < topics.size(); i++){
         Topic t = topics.get(i);
         if(t.getId().equals(id)){
            topics.set(i,topic);
            return;
         }
       }
    }

    public void deleteTopic(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }
}
