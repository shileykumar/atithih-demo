package com.sunglowsys.service.impl;

import com.sunglowsys.domain.Hotel_InventoryCalendar;
import com.sunglowsys.repository.Hotel_InventoryCalendarRepository;
import com.sunglowsys.service.Hotel_InventoryCalendarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Controller
@Transactional
public class Hotel_inventoryCalendarServiceImpl implements Hotel_InventoryCalendarService {

    private final Logger log = LoggerFactory.getLogger(Hotel_inventoryCalendarServiceImpl.class);

    private final Hotel_InventoryCalendarRepository hotel_inventoryCalendarRepository;

    public Hotel_inventoryCalendarServiceImpl(Hotel_InventoryCalendarRepository hotel_inventoryCalendarRepository) {
        this.hotel_inventoryCalendarRepository = hotel_inventoryCalendarRepository;
    }

    @Override
    public Hotel_InventoryCalendar save(Hotel_InventoryCalendar hotel_inventoryCalendar) {
        log.debug("Request to save Hotel_InventoryCalendar : {}", hotel_inventoryCalendar);
        return hotel_inventoryCalendarRepository.save(hotel_inventoryCalendar);
    }

    @Override
    public Hotel_InventoryCalendar update(Hotel_InventoryCalendar hotel_inventoryCalendar) {
        log.debug("Request to update Hotel_InventoryCalendar : {}", hotel_inventoryCalendar);
        return hotel_inventoryCalendarRepository.save(hotel_inventoryCalendar);
    }

    @Override
    public Page<Hotel_InventoryCalendar> findAll(Pageable pageable) {
        log.debug("Request to find Hotel_InventoryCalendars");
        return hotel_inventoryCalendarRepository.findAll(pageable);
    }

    @Override
    public Optional<Hotel_InventoryCalendar> findById(Integer id) {
        log.debug("Request to find Hotel_InventoryCalendar : {}", id);
        return hotel_inventoryCalendarRepository.findById(id);
    }

    @Override
    public List<Hotel_InventoryCalendar> search(String searchText) {
        log.debug("Request to search Hotel_InventoryCalendar : {}", searchText);
        return null;
    }

    @Override
    public void delete(Integer id) {
        log.debug("Request to delete Hotel_InventoryCalendar : {}",id);
        hotel_inventoryCalendarRepository.deleteById(id);
    }
}
