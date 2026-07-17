package com.gastos.ws.WsGastos.repositoryWs;

import com.gastos.ws.WsGastos.config.WSSecurityInterceptor;
import com.gastos.ws.WsGastos.model.Gastos;
import com.gastos.ws.WsGastos.service.GastosServiceImpl;
import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.interceptor.InInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GastosRepository {

    @Autowired
    private GastosServiceImpl service;

    //uno por codigo
    public Optional<Gastos> getGastoById(Integer id) {
        return service.findById(id);
    }

}
