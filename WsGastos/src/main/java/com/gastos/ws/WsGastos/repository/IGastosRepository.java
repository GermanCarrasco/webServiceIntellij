package com.gastos.ws.WsGastos.repository;


import com.gastos.ws.WsGastos.model.Gastos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGastosRepository extends JpaRepository<Gastos,Integer> {
}
