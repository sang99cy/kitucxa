package org.o7planning.service.impl;

import org.o7planning.entity.UserEntity;
import org.o7planning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;

@Service
public class UserService implements org.o7planning.service.IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean checkUser(String email, String password) {
        ArrayList<UserEntity> a = userRepository.getUserByEmailAndPassword(email, password);
        if(a.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
}
