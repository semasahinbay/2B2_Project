package com.example.rentacar.services.dtos.invoice.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddInvoiceRequest {
    private int id;
    private LocalDate createDate;
}
