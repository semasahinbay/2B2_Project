package com.example.rentacar.controllers;

import com.example.rentacar.services.abstracts.UserService;
import com.example.rentacar.services.dtos.model.responses.GetAllModelResponse;
import com.example.rentacar.services.dtos.model.responses.GetModelResponse;
import com.example.rentacar.services.dtos.user.requests.AddUserRequest;
import com.example.rentacar.services.dtos.user.requests.UpdateUserRequest;
import com.example.rentacar.services.dtos.user.responses.GetAllUserResponse;
import com.example.rentacar.services.dtos.user.responses.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("api/users")
public class UsersController {
    private UserService userService;

    @GetMapping("/getById/{id}")
    public GetUserResponse getById(@PathVariable int id){
        return userService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllUserResponse> getAll(){
        return userService.getAll();
    }

    @PostMapping("/add")
    private void add(@RequestBody AddUserRequest request){
        userService.add(request);
    }

    @PutMapping("/update")
    private void update(@RequestBody UpdateUserRequest request) {
        userService.update(request);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable int id){
        userService.delete(id);
    }

}
