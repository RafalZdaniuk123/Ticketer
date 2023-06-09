package rzdaniuk.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rzdaniuk.com.model.UserDto;
import rzdaniuk.com.service.AdminCustomersService;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/v1/admin/customer")
@RequiredArgsConstructor
public class AdminCustomersController {
    private final AdminCustomersService adminCustomersService;

    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getAllCustomers() {
        return new ResponseEntity<>(adminCustomersService.allUsers(), HttpStatus.OK);
    }
}
