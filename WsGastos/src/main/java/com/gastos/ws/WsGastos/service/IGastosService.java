package com.gastos.ws.WsGastos.service;


import com.gastos.ws.WsGastos.model.Gastos;
import java.util.List;
import java.util.Optional;

public interface IGastosService {
     List<Gastos> findAll();
     Optional<Gastos> findById(Integer id);
     Gastos create(Gastos gastos);
     Gastos update(Gastos gastos);
     void deleteById(Integer id);
}
