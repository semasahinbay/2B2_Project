package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.rental.requests.AddRentalRequest;
import com.example.rentacar.services.dtos.rental.requests.UpdateRentalRequest;
import com.example.rentacar.services.dtos.rental.responses.GetAllRentalResponse;
import com.example.rentacar.services.dtos.rental.responses.GetRentalResponse;

import java.util.List;

public interface RentalService {
    void add(AddRentalRequest request);
    void update(UpdateRentalRequest request);
    void delete(int id);
    GetRentalResponse getById(int id);
    List<GetAllRentalResponse> getAll();
}
