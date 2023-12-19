package com.example.rentacar.services.abstracts;


import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.color.requests.AddColorRequest;
import com.example.rentacar.services.dtos.color.requests.UpdateColorRequest;
import com.example.rentacar.services.dtos.color.responses.GetAllColorResponse;
import com.example.rentacar.services.dtos.color.responses.GetColorResponse;

import java.util.List;

public interface ColorService {
    void add(AddColorRequest request);
    void update(UpdateColorRequest request);
    void delete(int id);
    GetColorResponse getById(int id);
    List<GetAllColorResponse> getAll();
}
