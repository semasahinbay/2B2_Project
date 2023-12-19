package com.example.rentacar.services.dtos.car.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCarRequest {
    private Integer id;
    private int kilometer;
    private String plate;
    private int year;
    private double dailyPrice;
}
