package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Car;
import com.example.rentacar.entities.User;
import com.example.rentacar.repositories.UserRepository;
import com.example.rentacar.services.abstracts.UserService;
import com.example.rentacar.services.dtos.car.responses.GetAllCarResponse;
import com.example.rentacar.services.dtos.car.responses.GetCarResponse;
import com.example.rentacar.services.dtos.user.requests.AddUserRequest;
import com.example.rentacar.services.dtos.user.requests.UpdateUserRequest;
import com.example.rentacar.services.dtos.user.responses.GetAllUserResponse;
import com.example.rentacar.services.dtos.user.responses.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class UserManager implements UserService {
    private UserRepository userRepository;

    @Override
    public void add(AddUserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setSurname(request.getSurname());
        user.setEmail(request.getEmail());
        user.setBirthDate(request.getBirthDate());
        userRepository.save(user);

    }

    @Override
    public void update(UpdateUserRequest request) {
        User userToUpdate = userRepository.findById(request.getId()).orElseThrow();
        userToUpdate.setName(request.getName());
        userToUpdate.setSurname(request.getSurname());
        userToUpdate.setEmail(request.getEmail());
        userToUpdate.setBirthDate(request.getBirthDate());
        userRepository.save(userToUpdate);

    }

    @Override
    public void delete(int id) {
        User userToDelete = userRepository.findById(id).orElseThrow();
        userRepository.save(userToDelete);
    }

    @Override
    public GetUserResponse getById(int id) {
        User user = userRepository.findById(id).orElseThrow();
        GetUserResponse response = new GetUserResponse();

        response.setName(user.getName());
        response.setSurname(user.getSurname());
        response.setEmail(user.getEmail());
        response.setBirthDate(user.getBirthDate());
        return response;
    }
    @Override
    public List<GetAllUserResponse> getAll() {
        List<User> users = userRepository.findAll();
        List<GetAllUserResponse> userResponses = new ArrayList<>();

        for (User user : users) {
            GetAllUserResponse response = new GetAllUserResponse();
            response.setId(user.getId());
            response.setName(user.getName());
            response.setSurname(user.getSurname());
            response.setEmail(user.getEmail());
            response.setBirthDate(user.getBirthDate());
            userResponses.add(response);

        }
        return userResponses;
    }
}
