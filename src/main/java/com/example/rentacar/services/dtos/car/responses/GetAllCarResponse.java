package com.example.rentacar.services.dtos.car.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllCarResponse {
    private Integer id;
    private int kilometer;
    private String plate;
    private int year;
    private double dailyPrice;
}
