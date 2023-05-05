package com.example.movieService.controllers;

import com.example.movieService.models.Developer;
import com.example.movieService.services.ServiceForDevelopers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperRestController {

    private ServiceForDevelopers service;

    @Autowired
    public DeveloperRestController(ServiceForDevelopers service) {
        this.service = service;
    }

    @GetMapping
    public List<Developer>getAll(){

        return service.getAllDevelopers();
    }
    @GetMapping("/{id}")
    public Developer getById(@PathVariable long id){
        return service.getDeveloperById(id);
    }
    @PostMapping("/create")
    public Developer create(@RequestBody Developer newDeveloper){
        return service.createNewDeveloper(newDeveloper);
    }
    @DeleteMapping("/del/{id}")
    public void deleteById(@PathVariable long id) {
        service.removeDeveloperById(id);
    }

}
