package com.example.rentacar.controllers;

import com.example.rentacar.services.abstracts.BrandService;
import com.example.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.example.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("api/brands")
public class BrandsController {
    private BrandService brandService;

    @GetMapping("/getById/{id}")
    public GetBrandResponse getById(@PathVariable int id){
        return brandService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllBrandResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody AddBrandRequest request) {
        brandService.add(request);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateBrandRequest request) {
        brandService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        brandService.delete(id);
    }

}