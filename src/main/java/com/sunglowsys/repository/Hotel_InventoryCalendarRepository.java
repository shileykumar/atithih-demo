package com.sunglowsys.repository;

import com.sunglowsys.domain.Hotel_InventoryCalendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Hotel_InventoryCalendarRepository extends JpaRepository<Hotel_InventoryCalendar, Integer> {
}
