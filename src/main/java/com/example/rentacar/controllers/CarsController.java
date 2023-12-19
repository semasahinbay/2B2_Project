package com.example.rentacar.controllers;

import com.example.rentacar.services.abstracts.CarService;
import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.car.requests.AddCarRequest;
import com.example.rentacar.services.dtos.car.requests.UpdateCarRequest;
import com.example.rentacar.services.dtos.car.responses.GetAllCarResponse;
import com.example.rentacar.services.dtos.car.responses.GetCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/cars")
public class CarsController {
    private CarService carService;

    @GetMapping("/getById/{id}")
    public GetCarResponse getById(@PathVariable int id){
        return carService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllCarResponse> getAll(){
        return carService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody AddCarRequest request){
        carService.add(request);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateCarRequest request) {
        carService.update(request);
    }

    @DeleteMapping("/{id}")
        public void delete(@PathVariable Integer id) {
            carService.delete(id);
        }
    }


