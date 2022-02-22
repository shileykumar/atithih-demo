package com.sunglowsys.controller;

import com.sunglowsys.domain.Hotel_InventoryCalendar;
import com.sunglowsys.service.Hotel_InventoryCalendarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/hotel-inventory-calendars")
public class Hotel_InventoryCalendarController {


    private final Logger log = LoggerFactory.getLogger(Hotel_InventoryCalendarController.class);

    private final Hotel_InventoryCalendarService hotel_inventoryCalendarService;

    public Hotel_InventoryCalendarController(Hotel_InventoryCalendarService hotel_inventoryCalendarService) {
        this.hotel_inventoryCalendarService = hotel_inventoryCalendarService;
    }

    @GetMapping
    public ModelAndView hotel_InventoryCalendarList() {
        log.debug("Web request to get Hotel_InventoryCalendars");
        Page<Hotel_InventoryCalendar> page = hotel_inventoryCalendarService.findAll(PageRequest.of(0,20));
        return new ModelAndView("hotel-inventory-calendar/hotel-inventory-calendar-list", "hotel_inventoryCalendars", page.getContent());
    }

    @GetMapping("/create")
    public ModelAndView createHotel_InventoryCalendarForm() {
        log.debug("Web request to load create Hotel_inventoryCalendar Form");
        return new ModelAndView("hotel-inventory-calendar/add-hotel-inventory-calendar", "hotel_inventoryCalendar", new Hotel_InventoryCalendar());
    }

    @PostMapping("/create")
    public ModelAndView createHotel_InventoryCalendar(@ModelAttribute @Valid Hotel_InventoryCalendar hotel_inventoryCalendar, BindingResult result) {
        log.debug("Web request to create Hotel_inventoryCalendar : {}", hotel_inventoryCalendar);
        if (result.hasErrors()) {
            return new ModelAndView("hotel-inventory-calendar/add-hotel-inventory-calendar");
        }
        hotel_inventoryCalendarService.save(hotel_inventoryCalendar);
        return new ModelAndView("redirect:/hotel-inventory-calendars");
    }

    @GetMapping("update/{id}")
    public ModelAndView updateHotel_InventoryCalendar(@PathVariable Integer id) {
        log.debug("Web request to update Hotel_InventoryCalendar : {}", id);
        return new ModelAndView("hotel-inventory-calendar/add-hotel-inventory-calendar", "hotel_inventoryCalendar", hotel_inventoryCalendarService.findById(id).get());
    }

    @GetMapping("delete/{id}")
    public ModelAndView deleteHotel_InventoryCalendar(@PathVariable Integer id) {
        log.debug("Web request to delete Hotel_InventoryCalendar : {}", id);
        hotel_inventoryCalendarService.delete(id);
        return new ModelAndView("redirect:/hotel-inventory-calendars");
    }
}
