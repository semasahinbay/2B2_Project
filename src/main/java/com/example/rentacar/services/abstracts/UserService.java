package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.user.requests.AddUserRequest;
import com.example.rentacar.services.dtos.user.requests.UpdateUserRequest;
import com.example.rentacar.services.dtos.user.responses.GetAllUserResponse;
import com.example.rentacar.services.dtos.user.responses.GetUserResponse;

import java.util.List;

public interface UserService {
    void add(AddUserRequest request);
    void update(UpdateUserRequest request);
    void delete(int id);
    GetUserResponse getById(int id);
    List<GetAllUserResponse> getAll();
}
