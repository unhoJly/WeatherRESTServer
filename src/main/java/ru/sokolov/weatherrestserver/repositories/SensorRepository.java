package ru.sokolov.weatherrestserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sokolov.weatherrestserver.models.Sensor;

import java.util.Optional;

public interface SensorRepository extends JpaRepository<Sensor, Integer> {
    Optional<Sensor> findSensorByName(String name);
}