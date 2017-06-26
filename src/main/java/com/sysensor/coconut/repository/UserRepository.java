package com.sysensor.coconut.repository;

import com.sysensor.coconut.entity.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User> {

    List<User> findAllByUserName(String userName);
}
