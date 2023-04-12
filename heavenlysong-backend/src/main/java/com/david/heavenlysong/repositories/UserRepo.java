package com.david.heavenlysong.repositories;

import com.david.heavenlysong.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
