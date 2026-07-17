package com.example.carros2.demo.web.services.carros2.repository;

import com.example.carros2.demo.web.services.carros2.model.CarrosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IMarcaRepository extends JpaRepository <CarrosModel,Integer> {

    //Find by marca
    List<CarrosModel> findByMarca(String marca);
}
