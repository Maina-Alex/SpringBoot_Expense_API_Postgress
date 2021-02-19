package com.avania.expensetrackerapi.Services;

import com.avania.expensetrackerapi.Domain.User;
import com.avania.expensetrackerapi.Exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastname, String email,String password) throws EtAuthException;
}
