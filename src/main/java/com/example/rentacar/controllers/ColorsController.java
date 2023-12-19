package com.example.rentacar.controllers;

import com.example.rentacar.services.abstracts.ColorService;
import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.car.responses.GetAllCarResponse;
import com.example.rentacar.services.dtos.color.requests.AddColorRequest;
import com.example.rentacar.services.dtos.color.requests.UpdateColorRequest;
import com.example.rentacar.services.dtos.color.responses.GetAllColorResponse;
import com.example.rentacar.services.dtos.color.responses.GetColorResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/colors")
public class ColorsController {
    private ColorService colorService;

    @GetMapping("/getById/{id}")
    public GetColorResponse getById(@PathVariable int id){
        return colorService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllColorResponse> getAll(){
        return colorService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody AddColorRequest request) {
        colorService.add(request);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateColorRequest request) {
        colorService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        colorService.delete(id);
    }
}
