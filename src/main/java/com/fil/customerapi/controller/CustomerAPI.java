package com.fil.customerapi.controller;

import com.fil.customerapi.service.ICustomerService;
import com.fil.model.controller.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CustomerAPI {
    @Autowired
    private ICustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        log.info("New customers creation: {} ", customer);
        Customer createdCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        log.info("Fetching all customers");
        return customerService.getCustomers();
    }

}
