package org.o7planning.repository;


import org.o7planning.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query(value="select * from user where user.email= ? and user.password= ?", nativeQuery=true)
    ArrayList<UserEntity> getUserByEmailAndPassword(String email, String password);
}
