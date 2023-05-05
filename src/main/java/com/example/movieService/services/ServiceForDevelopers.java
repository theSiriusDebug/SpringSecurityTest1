package com.example.movieService.services;

import com.example.movieService.models.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import java.util.List;

@Service
public class ServiceForDevelopers {

    private com.example.movieService.jpaRepositoryForDevelopers jpaRepositoryForDevelopers;
    private static final Logger logger = Logger.getLogger(ServiceForDevelopers.class);

    @Autowired
    public ServiceForDevelopers(com.example.movieService.jpaRepositoryForDevelopers jpaRepositoryForDevelopers) {
        this.jpaRepositoryForDevelopers = jpaRepositoryForDevelopers;
    }
    public List<Developer> getAllDevelopers(){
        logger.info("was found all developers");
        return jpaRepositoryForDevelopers.findAll();
    }
    public Developer getDeveloperById(long id){
        logger.info(String.format("was found developer by id %d", id));
        return jpaRepositoryForDevelopers.findById(id);
    }
    public Developer createNewDeveloper(Developer newDeveloper){
        logger.info(String.format("was create new developer with name %s", newDeveloper.getFirstName() + " " + newDeveloper.getSurName()));
        jpaRepositoryForDevelopers.save(newDeveloper);
        return newDeveloper;
    }
    public void removeDeveloperById(long id){
        logger.info(String.format("developer by id %d was removed", id));
        jpaRepositoryForDevelopers.deleteById(id);
    }
}
