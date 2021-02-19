package com.avania.expensetrackerapi.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private  String email;
    private String password;

}
