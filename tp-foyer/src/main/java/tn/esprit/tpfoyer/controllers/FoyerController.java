package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.Foyer;
import tn.esprit.tpfoyer.services.IChambreService;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")

public class FoyerController {
    @Autowired //pour que dans la base ne get pas des nulls
    IFoyerService foyerService;

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @GetMapping("/getAllFoyer")
    List<Foyer> getAllFoyer() {
        return foyerService.retriveAllFoyers();
    }

    @GetMapping("/getFoyer/{idFoyer}")
    Foyer getChambre(@PathVariable long idFoyer) {
        return foyerService.retriveFoyer(idFoyer);
    }

    @PutMapping("/updateFoyer")
    Foyer updateChambre( @RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/deleteFoyer/{idFoyer}")
    void deleteChambre(@PathVariable("idFoyer") long idFoyer) { // si on veu changer le nom des paremetre passer pour ester et le parametre de la methode
        foyerService.deleteFoyer(idFoyer);
    }

    @PostMapping("/affectBlocsToFoyer/{idFoyer}/{blocIds}")
    void affectBlocsToFoyer(@PathVariable long idFoyer, @PathVariable List<Long> blocIds) {
        foyerService.affectBlocToFoyer(idFoyer, blocIds);
    }




}
