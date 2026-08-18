package com.example.shoppinglist.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppinglist.model.Event;
import com.example.shoppinglist.service.EventService;


@RestController("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public ResponseEntity<Map<Long,Event>> getAllEvents(){
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable long id) {
        Event event = eventService.getEventById(id);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Event> addEvent(@RequestBody Event newEvent){
        Event event = eventService.addEvent(newEvent);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }
}
