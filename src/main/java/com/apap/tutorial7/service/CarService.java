package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.CarModel;

/**
 * CarService
 */
public interface CarService {
    CarModel addCar(CarModel car);

    List<CarModel> getAllCar();
    
    Optional<CarModel> getCarDetailById(Long id);

    Optional<CarModel> getCarDetailByType(String type);

    void deleteCar(CarModel car);

    List<CarModel> getListCarOrderByPriceAsc(Long dealerId);
}