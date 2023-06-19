package com.fil.customerapi.service;

import com.fil.model.controller.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Slf4j
@Service
public class CustomerService implements ICustomerService{
    List<Customer> customers = new ArrayList<Customer>();

    public CustomerService() {
        customers.add(new Customer("1", "Filip", "Budapest", 25));
        customers.add(new Customer("2", "John", "London", 30));
        customers.add(new Customer("3", "Mary", "Paris", 20));
    }

    @Override
    public Customer createCustomer(Customer customer) {
        log.info("Creating new customer: {} ", customer);
        customer.setId(generateCustomerId());
        customers.add(customer);
        return customer;
    }

    @Override
    public List<Customer> getCustomers() {
        log.info("Fetching all customers: {} ", customers.size());
        return customers;
    }

    private String generateCustomerId(){
        int num = new Random().nextInt(100000);
        return "a"+ String.format("%5d",num);
    }
}
