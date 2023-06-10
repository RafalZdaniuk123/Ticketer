package rzdaniuk.com.model;

import lombok.Data;

@Data
public class UserDto {
    private String username;
    private String password;
    private boolean enabled;
    private String email;
    private Double userbalance;
    private Integer id;
}
