package rzdaniuk.com.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import rzdaniuk.com.model.CustomerDto;

@Repository
@RequiredArgsConstructor
public class CustomerDaoImpl implements CustomerDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public CustomerDto getCustomerById(Integer id) {
        String getCustomerByIdSql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(getCustomerByIdSql, new BeanPropertyRowMapper<>(CustomerDto.class), id);
    }

    @Override
    public void createCustomer(CustomerDto customerDto) {
        String createCustomerSql = "INSERT INTO `users`(`username`, `password`, `email`, `userbalance`) VALUES (?,?,?,?) ";
        jdbcTemplate.update(createCustomerSql, customerDto.getUsername(), customerDto.getPassword(), customerDto.getEmail(), customerDto.getUserbalance());
    }

    @Override
    public void deleteCustomer(Integer id) {
        String deleteCustomerSql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(deleteCustomerSql, id);
    }


}
