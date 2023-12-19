package com.example.rentacar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "cars")
@Entity
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "kilometer")
    private int kilometer;

    @Column(name ="plate")
    private String plate;

    @Column(name = "year")
    private int year;

    @Column(name= "daily_price")
  private double dailyPrice;


    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color colors;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model models;

    @OneToMany(mappedBy = "cars")
    @JsonIgnore
    private List<Rental> rentals;
}
