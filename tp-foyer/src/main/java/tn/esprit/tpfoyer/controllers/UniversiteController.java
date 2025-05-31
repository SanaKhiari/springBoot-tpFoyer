package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Universite;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universie")


public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;


    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @GetMapping("/getAllUniversite")
    List<Universite> getAllUniversite() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/getUniversiteById/{id}")
    Universite getUniversiteById(@PathVariable long id) {
        return universiteService.retriveUniversiteById(id);
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }
    @DeleteMapping("/deleteUniversite/{id}")
    void deleteUniversite(@PathVariable long id) {
        universiteService.deleteUniversiteById(id);
    }
}
