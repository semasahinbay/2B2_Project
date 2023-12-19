package com.example.rentacar.repositories;

import com.example.rentacar.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
}
