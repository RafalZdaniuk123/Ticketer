package rzdaniuk.com.repository;

import rzdaniuk.com.model.CustomerDto;

public interface CustomerDao {
    CustomerDto getCustomerById(Integer id);
}
