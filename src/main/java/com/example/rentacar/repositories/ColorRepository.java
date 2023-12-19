package com.example.rentacar.repositories;

import com.example.rentacar.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {
}
