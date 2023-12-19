package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.invoice.requests.AddInvoiceRequest;
import com.example.rentacar.services.dtos.invoice.requests.UpdateInvoiceRequest;
import com.example.rentacar.services.dtos.invoice.responses.GetAllInvoiceResponse;
import com.example.rentacar.services.dtos.invoice.responses.GetInvoiceResponse;

import java.util.List;

public interface InvoiceService {
    void add(AddInvoiceRequest request);
    void update(UpdateInvoiceRequest request);
    void delete(int id);
    GetInvoiceResponse getById(int id);
    List<GetAllInvoiceResponse> getAll();
}
