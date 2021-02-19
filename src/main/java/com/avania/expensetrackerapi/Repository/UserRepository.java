package com.avania.expensetrackerapi.Repository;

import com.avania.expensetrackerapi.Domain.User;
import com.avania.expensetrackerapi.Exceptions.EtAuthException;

public interface UserRepository {
    Integer create (String firstName, String lastName,String email, String password ) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    Integer getCountByEmail(String email);
    User findById(Integer userId);
}
