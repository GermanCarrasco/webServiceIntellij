package com.example.carros2.demo.web.services.carros2.service;

import com.example.carros2.demo.web.services.carros2.model.CarrosModel;
import com.example.carros2.demo.web.services.carros2.repository.IMarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CarrosServiceImpl implements ICarrosService{

    @Autowired
    private IMarcaRepository repository;

    @Override
    public List<CarrosModel> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CarrosModel> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CarrosModel create(CarrosModel carrosModel) {
        return repository.save(carrosModel);
    }

    @Override
    public CarrosModel update(CarrosModel carrosModel) {
        return repository.save(carrosModel);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
