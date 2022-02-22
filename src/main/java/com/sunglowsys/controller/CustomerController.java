package com.sunglowsys.controller;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerService;
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
@RequestMapping("/customers")
public class CustomerController {

    private final Logger log = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ModelAndView customerList() {
        log.debug("Web request to get Customers");
        Page<Customer> page = customerService.findAll(PageRequest.of(0,20));
        return new ModelAndView("customer/customer-list", "customers", page.getContent());
    }

    @GetMapping("/create")
    public ModelAndView createCustomerForm() {
        log.debug("Web request to load create Customer form");
        return new ModelAndView("customer/add-customer", "customer", new Customer());
    }

    @PostMapping("/create")
    public ModelAndView createCustomer(@ModelAttribute @Valid Customer customer, BindingResult result) {
        log.debug("Web request to create Customer : {}", customer);
        if (result.hasErrors()) {
            return new ModelAndView("customer/add-customer");
        }
        customerService.save(customer);
        return new ModelAndView("redirect:/customers");
    }

    @GetMapping("/update/{id}")
    public ModelAndView updateCustomer(@PathVariable Integer id) {
        log.debug("Web request to update Customer : {}", id);
        return new ModelAndView("customer/add-customer", "customer", customerService.findById(id).get());
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable Integer id) {
        log.debug("Web request to delete Customer : {}", id);
        customerService.delete(id);
        return new ModelAndView("redirect:/customers");
    }
}
