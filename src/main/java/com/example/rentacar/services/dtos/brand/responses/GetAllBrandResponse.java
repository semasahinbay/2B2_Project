package com.example.rentacar.services.dtos.brand.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllBrandResponse {
    private int id;
    private String name;
}
