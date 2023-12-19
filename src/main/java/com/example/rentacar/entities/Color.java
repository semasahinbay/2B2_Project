package com.example.rentacar.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "colors")
@Entity
@Getter
@Setter
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name = "name")
    private String name;


    @OneToMany (mappedBy = "colors")
    private List<Car> cars;
}
