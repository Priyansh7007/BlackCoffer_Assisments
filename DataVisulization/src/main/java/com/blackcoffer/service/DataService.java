package com.blackcoffer.service;

import com.blackcoffer.entities.DataEntity;
import com.blackcoffer.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }


    public List<DataEntity> getAllData() {
        return dataRepository.findAll();
    }
}