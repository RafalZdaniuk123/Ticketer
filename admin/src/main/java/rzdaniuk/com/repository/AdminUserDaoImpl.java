package rzdaniuk.com.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import rzdaniuk.com.model.UserDto;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AdminUserDaoImpl implements AdminUserDao{

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<UserDto> allUsers() {
        String getAllSql = "SELECT * FROM users";
        return jdbcTemplate.query(getAllSql, new BeanPropertyRowMapper<>(UserDto.class));
    }
}
