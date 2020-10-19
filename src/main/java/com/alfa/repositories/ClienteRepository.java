package com.alfa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfa.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
