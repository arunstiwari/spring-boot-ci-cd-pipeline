package com.fil.customerapi.service;

import com.fil.model.controller.Customer;

import java.util.List;

public interface ICustomerService {
    Customer createCustomer(Customer customer);

    List<Customer> getCustomers();
}
