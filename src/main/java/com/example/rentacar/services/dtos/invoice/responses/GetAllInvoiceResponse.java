package com.example.rentacar.services.dtos.invoice.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllInvoiceResponse {
    private int id;
    private LocalDate createDate;
}
