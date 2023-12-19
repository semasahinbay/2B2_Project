package com.example.rentacar.repositories;

import com.example.rentacar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
