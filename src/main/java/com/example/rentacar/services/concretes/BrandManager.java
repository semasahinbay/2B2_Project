package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Brand;
import com.example.rentacar.repositories.BrandRepository;
import com.example.rentacar.services.abstracts.BrandService;
import com.example.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.example.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Override
    public void add(AddBrandRequest request) {
        Brand brand = new Brand();
        brand.setName(request.getName());
        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest request) {
        Brand brandToUpdate = brandRepository.findById(request.getId()).orElseThrow();
        brandToUpdate.setName(request.getName());
        brandRepository.save(brandToUpdate);
    }

    @Override
    public void delete(Integer id) {
        Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        brandRepository.delete(brandToDelete);
    }

    @Override
    public GetBrandResponse getById(int id) {
        Brand brand = brandRepository.findById(id).orElseThrow();
        GetBrandResponse response = new GetBrandResponse();
        //response.setId(brand.getId());
        response.setName(brand.getName());
        return response;
    }
    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandResponse> brandResponses = new ArrayList<>();

        for (Brand brand : brands) {
            GetAllBrandResponse response = new GetAllBrandResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());
            brandResponses.add(response);
        }

        return brandResponses;
    }
}
