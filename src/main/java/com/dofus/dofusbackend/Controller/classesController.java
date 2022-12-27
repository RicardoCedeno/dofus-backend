package com.dofus.dofusbackend.Controller;

import com.dofus.dofusbackend.Entity.Classes;
import com.dofus.dofusbackend.Service.classesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/enciclopedia")
@CrossOrigin(origins = "http://localhost:4200")
public class classesController {

    @Autowired
    classesService service;

    @RequestMapping("/clases")
    public List<Classes> getAllDofusClasses() {

        return service.getAllClasses();
    }

    @GetMapping("/clases/{id}")
    public Optional<Classes> getMyClass(@PathVariable Integer id) {
        return service.getAClass(id);
    }
}


