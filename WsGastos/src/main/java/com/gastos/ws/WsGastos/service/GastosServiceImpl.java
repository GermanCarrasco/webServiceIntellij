package com.gastos.ws.WsGastos.service;


import com.gastos.ws.WsGastos.config.WSSecurityInterceptor;
import com.gastos.ws.WsGastos.model.Gastos;
import com.gastos.ws.WsGastos.repository.IGastosRepository;
import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.interceptor.InInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastosServiceImpl implements IGastosService{
    @Autowired
    private IGastosRepository repository;
    @Override
    public List<Gastos> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Gastos> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Gastos create(Gastos gastos) {
        return repository.save(gastos);
    }

    @Override
    public Gastos update(Gastos gastos) {
        return repository.save(gastos);
    }

    @Override
    public void deleteById(Integer id) {
         repository.deleteById(id);
    }
}
