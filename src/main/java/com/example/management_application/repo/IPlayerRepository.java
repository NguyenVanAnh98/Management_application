package com.example.management_application.repo;

import com.example.management_application.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerRepository extends JpaRepository<Player, Long> {
}
