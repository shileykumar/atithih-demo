package com.sunglowsys.controller;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.service.HotelService;
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
@RequestMapping("hotels")
public class HotelController {

    private final Logger log = LoggerFactory.getLogger(HotelController.class);

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public ModelAndView hotelList() {
        log.debug("Web request to get Hotels");
        Page<Hotel> page = hotelService.findAll(PageRequest.of(0,20));
        return new ModelAndView("hotel/hotel-list", "hotels", page.getContent());
    }

    @GetMapping("/create")
    public ModelAndView createHotelForm() {
        log.debug("Web request to load Create Hotel Form");
        return new ModelAndView("hotel/add-hotel", "hotel", new Hotel());
    }

    @PostMapping("/create")
    public ModelAndView createHotel(@ModelAttribute @Valid Hotel hotel, BindingResult result) {
        log.debug("Web request to create Hotel : {}", hotel);
        if (result.hasErrors()) {
            return new ModelAndView("hotel/add-hotel");
        }
        hotelService.save(hotel);
        return new ModelAndView("redirect:/hotels");
    }

    @GetMapping("update/{id}")
    public ModelAndView updateHotel(@PathVariable Integer id) {
        log.debug("Web request to update Hotel : {}", id);
        return new ModelAndView("hotel/add-hotel", "hotel", hotelService.findById(id).get());
    }

    @GetMapping("delete/{id}")
    public ModelAndView deleteHotel(@PathVariable Integer id) {
        log.debug("Web request to delete Hotel : {}", id);
        hotelService.delete(id);
        return new ModelAndView("redirect:/hotels");
    }
}
