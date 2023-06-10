package rzdaniuk.com.repository;

import rzdaniuk.com.model.UserDto;

import java.util.List;

public interface AdminUserDao {
    List<UserDto> allUsers();
}
