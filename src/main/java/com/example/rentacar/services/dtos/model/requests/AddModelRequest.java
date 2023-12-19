package com.example.rentacar.services.dtos.model.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddModelRequest {
    private int id;
    private String name;

}
