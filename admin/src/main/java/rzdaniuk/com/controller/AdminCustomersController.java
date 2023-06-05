package rzdaniuk.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin/customer")
public class AdminCustomersController {
    @GetMapping("/getAll")
    public String getAllCustomers(){
        return "Schould get all customers from admin panel";
    }
}
