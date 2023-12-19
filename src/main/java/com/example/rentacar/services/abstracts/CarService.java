package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.car.requests.AddCarRequest;
import com.example.rentacar.services.dtos.car.requests.UpdateCarRequest;
import com.example.rentacar.services.dtos.car.responses.GetAllCarResponse;
import com.example.rentacar.services.dtos.car.responses.GetCarResponse;

import java.util.List;

public interface CarService {
    void add(AddCarRequest request);
    void update(UpdateCarRequest request);
    void delete(Integer id);
    GetCarResponse getById(int id);
    List<GetAllCarResponse> getAll();
}
