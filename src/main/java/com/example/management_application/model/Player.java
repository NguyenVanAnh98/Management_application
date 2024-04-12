package com.example.management_application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "players")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateofBirth;
    private String experience;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;





}
