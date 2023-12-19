package com.example.rentacar.controllers;

import com.example.rentacar.entities.Model;
import com.example.rentacar.repositories.ModelRepository;
import com.example.rentacar.services.abstracts.ModelService;
import com.example.rentacar.services.dtos.invoice.responses.GetAllInvoiceResponse;
import com.example.rentacar.services.dtos.invoice.responses.GetInvoiceResponse;
import com.example.rentacar.services.dtos.model.requests.AddModelRequest;
import com.example.rentacar.services.dtos.model.requests.UpdateModelRequest;
import com.example.rentacar.services.dtos.model.responses.GetAllModelResponse;
import com.example.rentacar.services.dtos.model.responses.GetModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/models")
public class ModelsController {
    private ModelService modelService;

    @GetMapping("/getById/{id}")
    public GetModelResponse getById(@PathVariable int id){
        return modelService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllModelResponse> getAll(){
        return modelService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody AddModelRequest request){
        modelService.add(request);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateModelRequest request) {
        modelService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        modelService.delete(id);
    }
}
