package com.example.rentacar.controllers;

import com.example.rentacar.services.abstracts.InvoiceService;
import com.example.rentacar.services.dtos.color.responses.GetAllColorResponse;
import com.example.rentacar.services.dtos.color.responses.GetColorResponse;
import com.example.rentacar.services.dtos.invoice.requests.AddInvoiceRequest;
import com.example.rentacar.services.dtos.invoice.requests.UpdateInvoiceRequest;
import com.example.rentacar.services.dtos.invoice.responses.GetAllInvoiceResponse;
import com.example.rentacar.services.dtos.invoice.responses.GetInvoiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/invoices")
public class InvoicesController {
    private InvoiceService invoiceService;

    @GetMapping("/getById/{id}")
    public GetInvoiceResponse getById(@PathVariable int id){
        return invoiceService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllInvoiceResponse> getAll(){
        return invoiceService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody AddInvoiceRequest request){
        invoiceService.add(request);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateInvoiceRequest request){
        invoiceService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        invoiceService.delete(id);
    }
}
