package com.dofus.dofusbackend.Service;

import com.dofus.dofusbackend.Entity.Classes;
import com.dofus.dofusbackend.Repository.classesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class classesService {
    @Autowired
    classesRepository repository;

    public List<Classes> getAllClasses(){

        return repository.findAll();
    }

    public Optional<Classes> getAClass(Integer id){
        return repository.findById(id);
    }
}
