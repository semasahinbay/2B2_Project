package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Brand;
import com.example.rentacar.entities.Car;
import com.example.rentacar.repositories.CarRepository;
import com.example.rentacar.services.abstracts.CarService;
import com.example.rentacar.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.rentacar.services.dtos.brand.responses.GetBrandResponse;
import com.example.rentacar.services.dtos.car.requests.AddCarRequest;
import com.example.rentacar.services.dtos.car.requests.UpdateCarRequest;
import com.example.rentacar.services.dtos.car.responses.GetAllCarResponse;
import com.example.rentacar.services.dtos.car.responses.GetCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CarManager implements CarService {
    private CarRepository carRepository;

    @Override
    public void add(AddCarRequest request) {
        Car car = new Car();
        car.setKilometer(request.getKilometer());
        car.setPlate(request.getPlate());
        car.setDailyPrice(request.getDailyPrice());
        car.setYear(request.getYear());
        carRepository.save(car);
    }

    @Override
    public void update(UpdateCarRequest request) {
        Car carToUpdate = carRepository.findById(request.getId()).orElseThrow();
        carToUpdate.setKilometer(request.getKilometer());
        carToUpdate.setPlate(request.getPlate());
        carToUpdate.setDailyPrice(request.getDailyPrice());
        carToUpdate.setYear(request.getYear());
        carRepository.save(carToUpdate);
        carRepository.save(carToUpdate);
    }

    @Override
    public void delete(Integer id) {
        Car carToDelete = carRepository.findById(id).orElseThrow();
        carRepository.save(carToDelete);

    }

    @Override
    public GetCarResponse getById(int id) {
        Car car = carRepository.findById(id).orElseThrow();
        GetCarResponse response = new GetCarResponse();
        //response.setId(brand.getId());
        response.setDailyPrice(car.getDailyPrice());
        response.setKilometer(car.getKilometer());
        response.setYear(car.getYear());
        response.setPlate(car.getPlate());
        return response;
    }
    @Override
    public List<GetAllCarResponse> getAll() {
        List<Car> cars = carRepository.findAll();
        List<GetAllCarResponse> carResponses = new ArrayList<>();

        for (Car car : cars) {
            GetAllCarResponse response = new GetAllCarResponse();
            response.setId(car.getId());
            response.setDailyPrice(car.getDailyPrice());
            response.setKilometer(car.getKilometer());
            response.setYear(car.getYear());
            response.setPlate(car.getPlate());
            carResponses.add(response);

        }
        return carResponses;


    }
}
