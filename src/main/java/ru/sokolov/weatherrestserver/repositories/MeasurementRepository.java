package ru.sokolov.weatherrestserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sokolov.weatherrestserver.models.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}