package com.example.shoppinglist.service;

import java.util.HashMap;
import java.util.Map;

import com.example.shoppinglist.model.Event;

public class EventService {

    private Map<Long, Event> events = new HashMap<>();

    public EventService(){}

    public Map<Long, Event> getAllEvents(){
        return events;
    }

    public Event getEventById(long id){
        Event foundEvent = events.get(id);
        return foundEvent;
    }
    public Event addEvent(Event event){
        Event newEvent = events.put(event.getId(), event);
        return events.get(newEvent.getId());
    }
}
