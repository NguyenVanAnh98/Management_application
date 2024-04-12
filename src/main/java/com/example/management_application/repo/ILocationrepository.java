package com.example.management_application.repo;

import com.example.management_application.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILocationrepository extends JpaRepository<Location, Long> {
}
