package com.example.rentacar.services.dtos.rental.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddRentalRequest {
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate returnDate;
    private int startKilometer;
    private int endKilometer;
    private double totalPrice;
}
