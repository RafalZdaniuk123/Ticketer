package rzdaniuk.com.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerDto {
   private String username;
   private String password;
   private String email;
   private Double userbalance;
   private Integer id;

}
