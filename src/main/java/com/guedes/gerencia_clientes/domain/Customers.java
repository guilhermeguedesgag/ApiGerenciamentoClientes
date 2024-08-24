package com.guedes.gerencia_clientes.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Customers")
@Table(name = "customers")
public class Customers {
    @Column(name = "uuid")
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID uuid;

    @Column(name = "name")
    private String name;

    @Column(name = "state")
    private String state;

    @Column(name = "agent")
    private String agent;


}
