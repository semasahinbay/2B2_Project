package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.model.requests.AddModelRequest;
import com.example.rentacar.services.dtos.model.requests.UpdateModelRequest;
import com.example.rentacar.services.dtos.model.responses.GetAllModelResponse;
import com.example.rentacar.services.dtos.model.responses.GetModelResponse;

import java.util.List;

public interface ModelService {
    void add(AddModelRequest request);
    void  update(UpdateModelRequest request);
    void delete(int id);
    GetModelResponse getById(int id);
    List<GetAllModelResponse> getAll();
}
