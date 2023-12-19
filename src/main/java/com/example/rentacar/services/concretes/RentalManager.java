package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Car;
import com.example.rentacar.entities.Rental;
import com.example.rentacar.repositories.RentalRepository;
import com.example.rentacar.services.abstracts.RentalService;
import com.example.rentacar.services.dtos.car.responses.GetAllCarResponse;
import com.example.rentacar.services.dtos.car.responses.GetCarResponse;
import com.example.rentacar.services.dtos.rental.requests.AddRentalRequest;
import com.example.rentacar.services.dtos.rental.requests.UpdateRentalRequest;
import com.example.rentacar.services.dtos.rental.responses.GetAllRentalResponse;
import com.example.rentacar.services.dtos.rental.responses.GetRentalResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class RentalManager implements RentalService {
    private RentalRepository rentalRepository;

    @Override
    public void add(AddRentalRequest request) {
        Rental rental = new Rental();
        rental.setStartDate(request.getStartDate());
        rental.setEndDate(request.getEndDate());
        rental.setReturnDate(request.getReturnDate());
        rental.setStartKilometer(request.getStartKilometer());
        rental.setEndKilometer(request.getEndKilometer());
        rental.setTotalPrice(request.getTotalPrice());
        rentalRepository.save(rental);

    }

    @Override
    public void update(UpdateRentalRequest request) {
        Rental rentalToUpdate = rentalRepository.findById(request.getId()).orElseThrow();
        rentalToUpdate.setStartDate(request.getStartDate());
        rentalToUpdate.setEndDate(request.getEndDate());
        rentalToUpdate.setReturnDate(request.getReturnDate());
        rentalToUpdate.setStartKilometer(request.getStartKilometer());
        rentalToUpdate.setEndKilometer(request.getEndKilometer());
        rentalToUpdate.setTotalPrice(request.getTotalPrice());
        rentalRepository.save(rentalToUpdate);

    }

    @Override
    public void delete(int id) {
        Rental rentalToDelete = rentalRepository.findById(id).orElseThrow();
        rentalRepository.delete(rentalToDelete);
    }

    @Override
    public GetRentalResponse getById(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        GetRentalResponse response = new GetRentalResponse();

        response.setStartDate(rental.getStartDate());
        response.setEndDate(rental.getEndDate());
        response.setReturnDate(rental.getReturnDate());
        response.setStartKilometer(rental.getStartKilometer());
        response.setEndKilometer(rental.getEndKilometer());
        response.setTotalPrice(rental.getTotalPrice());

        return response;
    }

    @Override
    public List<GetAllRentalResponse> getAll() {
        List<Rental> rentals = rentalRepository.findAll();
        List<GetAllRentalResponse> rentalResponses = new ArrayList<>();

        for (Rental rental : rentals) {
            GetAllRentalResponse response = new GetAllRentalResponse();
            response.setId(rental.getId());
            response.setStartDate(rental.getStartDate());
            response.setEndDate(rental.getEndDate());
            response.setReturnDate(rental.getReturnDate());
            response.setStartKilometer(rental.getStartKilometer());
            response.setEndKilometer(rental.getEndKilometer());
            response.setTotalPrice(rental.getTotalPrice());
            rentalResponses.add(response);

        }
        return rentalResponses;
    }
}
