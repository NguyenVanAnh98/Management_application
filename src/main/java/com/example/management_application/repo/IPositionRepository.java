package com.example.management_application.repo;

import com.example.management_application.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position, Long> {
}
