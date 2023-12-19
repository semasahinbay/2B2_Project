package com.example.rentacar.controllers;

import com.example.rentacar.services.abstracts.RentalService;
import com.example.rentacar.services.dtos.model.responses.GetAllModelResponse;
import com.example.rentacar.services.dtos.model.responses.GetModelResponse;
import com.example.rentacar.services.dtos.rental.requests.AddRentalRequest;
import com.example.rentacar.services.dtos.rental.requests.UpdateRentalRequest;
import com.example.rentacar.services.dtos.rental.responses.GetAllRentalResponse;
import com.example.rentacar.services.dtos.rental.responses.GetRentalResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/rentals")
public class RentalsController {
    private RentalService rentalService;

    @GetMapping("/getById/{id}")
    public GetRentalResponse getById(@PathVariable int id){
        return rentalService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllRentalResponse> getAll(){
        return rentalService.getAll();
    }

    @PostMapping ("/add")
    public void add(@RequestBody AddRentalRequest request){
       rentalService.add(request);
    }

    @PutMapping ("/update")
    public void update(@RequestBody UpdateRentalRequest request){
        rentalService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){rentalService.delete(id);

    }

}
