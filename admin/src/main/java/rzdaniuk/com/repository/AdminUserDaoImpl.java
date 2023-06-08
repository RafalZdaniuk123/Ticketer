package rzdaniuk.com.repository;

import org.springframework.stereotype.Repository;
import rzdaniuk.com.model.UserDto;

import java.util.List;

@Repository
public class AdminUserDaoImpl implements AdminUserDao{
    @Override
    public List<UserDto> allUsers() {
        return List.of(new UserDto());
    }
}
