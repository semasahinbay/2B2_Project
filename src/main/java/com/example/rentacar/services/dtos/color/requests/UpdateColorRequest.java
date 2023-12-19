package com.example.rentacar.services.dtos.color.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateColorRequest {
    private int id;
    private String name;
}
