package com.guedes.gerencia_clientes.repository;

import com.guedes.gerencia_clientes.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository <Customers, UUID> {
}
