package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Invoice;
import com.example.rentacar.entities.Model;
import com.example.rentacar.repositories.ModelRepository;
import com.example.rentacar.services.abstracts.ModelService;
import com.example.rentacar.services.dtos.invoice.responses.GetAllInvoiceResponse;
import com.example.rentacar.services.dtos.invoice.responses.GetInvoiceResponse;
import com.example.rentacar.services.dtos.model.requests.AddModelRequest;
import com.example.rentacar.services.dtos.model.requests.UpdateModelRequest;
import com.example.rentacar.services.dtos.model.responses.GetAllModelResponse;
import com.example.rentacar.services.dtos.model.responses.GetModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;

    @Override
    public void add(AddModelRequest request) {
        Model model =new Model();
        model.setName(request.getName());
        modelRepository.save(model);
    }

    @Override
    public void update(UpdateModelRequest request) {
        Model modelToUpdate =modelRepository.findById(request.getId()).orElseThrow();
        modelToUpdate.setName(request.getName());
        modelRepository.save(modelToUpdate);
    }

    @Override
    public void delete(int id) {
        Model modelToDelete =modelRepository.findById(id).orElseThrow();
        modelRepository.delete(modelToDelete);
    }

    @Override
    public GetModelResponse getById(int id) {
        Model model = modelRepository.findById(id).orElseThrow();
        GetModelResponse response = new GetModelResponse();

        response.setName(model.getName());
        return response;
    }

    @Override
    public List<GetAllModelResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModelResponse> modelResponses = new ArrayList<>();

        for (Model model : models) {
            GetAllModelResponse response = new GetAllModelResponse();
            response.setId(model.getId());
            response.setName(model.getName());
            modelResponses.add(response);
        }
        return modelResponses;
    }
}
