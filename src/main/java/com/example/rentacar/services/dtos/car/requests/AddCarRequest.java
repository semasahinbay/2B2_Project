package com.example.rentacar.services.dtos.car.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddCarRequest {
    private int kilometer;
    private String plate;
    private int year;
    private double dailyPrice;
}
