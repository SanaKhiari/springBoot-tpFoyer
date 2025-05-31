package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.Etudiant;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")

public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;


    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("/getAllEtudiant")
    List<Etudiant> getAllEtudiant() {
        return etudiantService.retriveAllEtudiants();
    }

    @GetMapping("/getEtudiant/{idEtudiant}")
    Etudiant getEtudiant(@PathVariable long idEtudiant) {
        return etudiantService.retriveEtudiant(idEtudiant);
    }

    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant( @RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    void deleteEtudiant(@PathVariable("idEtudiant") long idEtudiant) { // si on veu changer le nom des paremetre passer pour ester et le parametre de la methode
        etudiantService.deleteEtudiant(idEtudiant);
    }

}
