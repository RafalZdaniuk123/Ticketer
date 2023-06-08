package rzdaniuk.com.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import rzdaniuk.com.model.CustomerDto;

@Repository
@RequiredArgsConstructor
public class CustomerDaoImpl implements CustomerDao {

    private final JdbcTemplate jdbcTemplate;


    @Override
    public CustomerDto getCustomerById(Integer id) {
        return new CustomerDto();
    }

}