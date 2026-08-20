package com.example.shoppinglist.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.shoppinglist.exceptions.ResourceNotFoundException;
import com.example.shoppinglist.exceptions.BadRequestException;
import com.example.shoppinglist.model.Event;

@Service
public class EventService {

    private Map<Long, Event> events = new HashMap<>();

    public EventService(){}

    public Map<Long, Event> getAllEvents(){
        return events;
    }

    public Event getEventById(long id){
        Event foundEvent = events.get(id);

        if (foundEvent == null){
            throw new ResourceNotFoundException("Event with id " + id + " not found");
        }
        return foundEvent;
    }
    public Event addEvent(Event event){
        if (event.getDate().compareTo("2026-01-01") < 0){
            throw new BadRequestException("Event date cannot be in the past");
        }

        events.put(event.getId(), event);
        return event;
    }
}
