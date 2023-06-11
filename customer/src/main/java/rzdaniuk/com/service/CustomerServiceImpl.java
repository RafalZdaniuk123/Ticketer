package rzdaniuk.com.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rzdaniuk.com.model.CustomerDto;
import rzdaniuk.com.repository.CustomerDao;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;

    @Override
    public CustomerDto getCustomerById(Integer id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public void createCustomer(CustomerDto customerDto) {
        customerDto.setUserbalance(1000.0);
        customerDao.createCustomer(customerDto);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerDao.deleteCustomer(id);
    }
}
