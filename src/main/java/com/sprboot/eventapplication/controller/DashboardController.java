package com.sprboot.eventapplication.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        // Example event details
        model.addAttribute("eventName", "Summer Coding Workshop");
        model.addAttribute("eventDate", "July 15, 2025");
        model.addAttribute("eventLocation", "DePaul University, Lincoln Park Campus");
        model.addAttribute("eventDescription", "A hands-on workshop to learn web development with Java and HTML integration.");

        // Example list of attendees
        List<String> attendees = Arrays.asList("Sidiqa Fekrat", "John Doe", "Jane Smith", "Ali Rahimi");
        model.addAttribute("attendees", attendees);

        return "dashboard"; // will render dashboard.html from templates
    }


}
