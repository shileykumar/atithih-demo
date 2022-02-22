package com.sunglowsys.service.impl;

import com.sunglowsys.domain.RoomType;
import com.sunglowsys.repository.RoomTypeRepository;
import com.sunglowsys.service.RoomTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoomTypeServiceImpl implements RoomTypeService {

    private final Logger log = LoggerFactory.getLogger(RoomTypeServiceImpl.class);

    private final RoomTypeRepository roomTypeRepository;

    public RoomTypeServiceImpl(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    @Override
    public RoomType save(RoomType roomType) {
        log.debug("Request to save RoomType : {}", roomType);
        return roomTypeRepository.save(roomType);
    }

    @Override
    public RoomType update(RoomType roomType) {
        log.debug("Request to update RoomType : {}", roomType);
        return roomTypeRepository.save(roomType );
    }

    @Override
    public Page<RoomType> findAll(Pageable pageable) {
        log.debug("Request to find RoomTypes");
        return roomTypeRepository.findAll(pageable);
    }

    @Override
    public Optional<RoomType> findById(Integer id) {
        log.debug("Request to find RoomType : {}", id);
        return roomTypeRepository.findById(id);
    }

    @Override
    public List<RoomType> search(String searchText) {
        log.debug("Request to search RoomType : {}", searchText);
        return null;
    }

    @Override
    public void delete(Integer id) {
        log.debug("Request to delete RoomType : {}", id);
        roomTypeRepository.deleteById(id);
    }
}
