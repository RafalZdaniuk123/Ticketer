package rzdaniuk.com.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rzdaniuk.com.model.UserDto;
import rzdaniuk.com.repository.AdminUserDao;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminCustomerServiceImpl implements AdminCustomersService {
    private final AdminUserDao adminUserDao;

    @Override
    public List<UserDto> allUsers() {
        return adminUserDao.allUsers();
    }
}
