package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalendar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HotelRateCalendarService {
    HotelRateCalendar save(HotelRateCalendar hotelRateCalendar);

    HotelRateCalendar update(HotelRateCalendar hotelRateCalendar);

    Page<HotelRateCalendar> findAll(Pageable pageable);

    Optional<HotelRateCalendar> findById(Integer id);

    List<HotelRateCalendar> search(String searchText);

    void delete(Integer id);
}
