package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel_InventoryCalendar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface Hotel_InventoryCalendarService {
    Hotel_InventoryCalendar save(Hotel_InventoryCalendar hotel_inventoryCalendar);

    Hotel_InventoryCalendar update(Hotel_InventoryCalendar hotel_inventoryCalendar);

    Page<Hotel_InventoryCalendar> findAll(Pageable pageable);

    Optional<Hotel_InventoryCalendar> findById(Integer id);

    List<Hotel_InventoryCalendar> search(String searchText);

    void delete(Integer id);
}
