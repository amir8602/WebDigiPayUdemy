package org.team;


import javax.validation.constraints.*;

import lombok.Data;


@Data
public class Customer {


    @NotNull(message = "is required")
    @Size(min=1 ,max = 10 , message = "lenght")
    @Pattern(regexp = "[a-zA-z]+")
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1 ,max = 25 , message = "lenght")
    @Pattern(regexp = "[a-zA-z]+")
    private String lastName;



//    @Pattern(regexp = "[0-9]*")
    @Min(value = 10,message = "out of bound")
    @Max(value = 20,message = "out of bound")
    @NotNull(message = "not null")
    private Integer number;





}
