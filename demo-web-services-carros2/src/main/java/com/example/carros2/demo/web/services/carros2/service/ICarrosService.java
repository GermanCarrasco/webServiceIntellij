package com.example.carros2.demo.web.services.carros2.service;

import com.example.carros2.demo.web.services.carros2.model.CarrosModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICarrosService {

    public List<CarrosModel> findAll();

    public Optional<CarrosModel> findOne(Integer id);

    public CarrosModel create(CarrosModel carrosModel);

    public CarrosModel update(CarrosModel carrosModel);

    public void delete(Integer id);


}
