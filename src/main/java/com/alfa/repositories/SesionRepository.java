package com.alfa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alfa.models.Sesion;

public interface SesionRepository extends JpaRepository<Sesion, Integer> {

}
