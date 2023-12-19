package com.example.rentacar.services.dtos.user.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllUserResponse {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
}
