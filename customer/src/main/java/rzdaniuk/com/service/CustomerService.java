package rzdaniuk.com.service;

import rzdaniuk.com.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(Integer id);

    void createCustomer(CustomerDto customerDto);

    void deleteCustomer(Integer id);
}
