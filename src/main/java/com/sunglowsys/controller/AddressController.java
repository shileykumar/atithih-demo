package com.sunglowsys.controller;

import com.sunglowsys.domain.Address;
import com.sunglowsys.service.AddressService;
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
@RequestMapping("addresses")
public class AddressController {

    private final Logger log = LoggerFactory.getLogger(AddressController.class);

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public ModelAndView addressList() {
        log.debug("Web request to get Addresses");
        Page<Address> page = addressService.findAll(PageRequest.of(0,20));
        return new ModelAndView("address/address-list", "addresses", page.getContent());
    }

    @GetMapping("/create")
    public ModelAndView createAddressForm() {
        return new ModelAndView("address/add-address", "address", new Address());
    }

    @PostMapping("/create")
    public ModelAndView createAddress(@ModelAttribute @Valid Address address, BindingResult result) {
        log.debug("Web request to create Address : {}", address);
        if (result.hasErrors()) {
            return new ModelAndView("address/add-address");
        }
        addressService.save(address);
        return new ModelAndView("redirect:/addresses");
    }

    @GetMapping("/update/{id}")
    public ModelAndView updateAddress(@PathVariable Integer id) {
        log.debug("Web request to update Address : {}", id);
        return new ModelAndView("address/add-address", "address", addressService.findById(id).get());
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteAddress(@PathVariable Integer id) {
        log.debug("Web request to delete Address : {}", id);
        addressService.delete(id);
        return new ModelAndView("redirect:/addresses");
    }
}
