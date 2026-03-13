package dev.santiago.cardapiodigital.repository;

import dev.santiago.cardapiodigital.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
