package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Invoice;
import com.example.rentacar.repositories.ColorRepository;
import com.example.rentacar.repositories.InvoiceRepository;
import com.example.rentacar.services.abstracts.InvoiceService;
import com.example.rentacar.services.dtos.invoice.requests.AddInvoiceRequest;
import com.example.rentacar.services.dtos.invoice.requests.UpdateInvoiceRequest;
import com.example.rentacar.services.dtos.invoice.responses.GetAllInvoiceResponse;
import com.example.rentacar.services.dtos.invoice.responses.GetInvoiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class InvoiceManager implements InvoiceService {
    private InvoiceRepository invoiceRepository;
    @Override
    public void add(AddInvoiceRequest request) {
        Invoice invoice =new Invoice();
        invoice.setCreateDate(request.getCreateDate());
        invoiceRepository.save(invoice);

    }

    @Override
    public void update(UpdateInvoiceRequest request) {
        Invoice invoiceToUpdate = invoiceRepository.findById(request.getId()).orElseThrow();
        invoiceToUpdate.setCreateDate(request.getCreateDate());
        invoiceRepository.save(invoiceToUpdate);
    }

    @Override
    public void delete(int id) {
        Invoice invoiceToUpdate = invoiceRepository.findById(id).orElseThrow();
        invoiceRepository.delete(invoiceToUpdate);
    }

    @Override
    public GetInvoiceResponse getById(int id) {
        Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        GetInvoiceResponse response = new GetInvoiceResponse();

        response.setCreateDate(invoice.getCreateDate());
        return response;
    }

    @Override
    public List<GetAllInvoiceResponse> getAll() {
        List<Invoice> invoices = invoiceRepository.findAll();
        List<GetAllInvoiceResponse> invoiceResponses = new ArrayList<>();

        for (Invoice invoice : invoices) {
            GetAllInvoiceResponse response = new GetAllInvoiceResponse();
            response.setId(invoice.getId());
            response.setCreateDate(invoice.getCreateDate());
            invoiceResponses.add(response);
        }
        return invoiceResponses;
    }
}
