package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HotelBookingService {
    HotelBooking save(HotelBooking hotelBooking);

    HotelBooking update(HotelBooking hotelBooking);

    Page<HotelBooking> findAll(Pageable pageable);

    Optional<HotelBooking> findById(Integer id);

    List<HotelBooking> search(String searchText);

    void delete(Integer id);
}
