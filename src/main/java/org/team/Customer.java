package org.team;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Customer {

    @NotNull(message = "is required")
    @Size(min=1 ,max = 25 , message = "Sara")
    @Pattern(regexp = "[a-zA-z]+")
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1 ,max = 25 , message = "Sara")
    @Pattern(regexp = "[a-zA-z]+")
    private String lastName;
}
