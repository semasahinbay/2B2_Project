package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Color;
import com.example.rentacar.repositories.BrandRepository;
import com.example.rentacar.repositories.ColorRepository;
import com.example.rentacar.services.abstracts.ColorService;
import com.example.rentacar.services.dtos.color.requests.AddColorRequest;
import com.example.rentacar.services.dtos.color.requests.UpdateColorRequest;
import com.example.rentacar.services.dtos.color.responses.GetAllColorResponse;
import com.example.rentacar.services.dtos.color.responses.GetColorResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ColorManager implements ColorService {
    private ColorRepository colorRepository;

    @Override
    public void add(AddColorRequest request) {
        Color color = new Color();
        color.setName(request.getName());
        colorRepository.save(color);

    }

    @Override
    public void update(UpdateColorRequest request) {
        Color colorToUpdate =colorRepository.findById(request.getId()).orElseThrow();
        colorToUpdate.setName(request.getName());
        colorRepository.save(colorToUpdate);

    }

    @Override
    public void delete(int id) {
        Color colorToDelete =colorRepository.findById(id).orElseThrow();
        colorRepository.delete(colorToDelete);

    }

    @Override
    public GetColorResponse getById(int id) {
        Color color =colorRepository.findById(id).orElseThrow();
        GetColorResponse response = new GetColorResponse();

        response.setName(color.getName());
        return response;
    }

    @Override
    public List<GetAllColorResponse> getAll() {
        List<Color> colors =colorRepository.findAll();
        List<GetAllColorResponse> colorResponses = new ArrayList<>();

        for (Color color : colors) {
         GetAllColorResponse response =new GetAllColorResponse();
         response.setId(color.getId());
         response.setName(color.getName());
         colorResponses.add(response);
        }

        return colorResponses;
    }
}
