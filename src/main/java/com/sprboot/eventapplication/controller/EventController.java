package com.sprboot.eventapplication.controller;

import java.util.List;

import com.sprboot.eventapplication.model.Event;
import com.sprboot.eventapplication.repository.EventRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/events")
public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<String> addEvent(@RequestBody Event event) {
        eventRepository.save(event);
        return ResponseEntity.ok("Event created Successfully!");
    }

}

