package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.example.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;

import java.util.List;

public interface BrandService {
    void add(AddBrandRequest request);
    void update(UpdateBrandRequest request);
    void delete(Integer id);
    GetBrandResponse getById(int id);
    List<GetAllBrandResponse> getAll();
}
