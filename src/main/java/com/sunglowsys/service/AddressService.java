package com.sunglowsys.service;

import com.sunglowsys.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    Address save(Address address);

    Address update(Address address);

    Page<Address> findAll(Pageable pageable);

    Optional<Address> findById(Integer id);

    List<Address> search(String searchText);

    void delete(Integer id);
}
