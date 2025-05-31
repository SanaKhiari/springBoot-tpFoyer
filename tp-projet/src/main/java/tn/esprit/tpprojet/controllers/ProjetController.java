package tn.esprit.tpprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entities.Equipe;
import tn.esprit.tpprojet.entities.Projet;
import tn.esprit.tpprojet.entities.ProjetDetail;
import tn.esprit.tpprojet.services.IEquipeService;
import tn.esprit.tpprojet.services.IProjetService;

import java.util.List;

@RestController
@RequestMapping("/projet")


public class ProjetController {
    @Autowired
    IProjetService projetService;


    @PostMapping("/addProjet")
    Projet addBloc(@RequestBody Projet projet) {
        return projetService.addProjet(projet);
    }

    @GetMapping("/getAllProjet")
    List<Projet> getAllProjet() {
        return projetService.retrieveAllProjets();
    }

    @GetMapping("/getProjetById/{id}")
    Projet getProjetById(@PathVariable long id) {
        return projetService.retriveProjetById(id);
    }

    @PutMapping("/updateProjet")
    Projet updateProjet(@RequestBody Projet projet) {
        return projetService.updateProjet(projet);
    }
    @DeleteMapping("/deleteProjet/{id}")
    void deleteProjet(@PathVariable long id) {
        projetService.deleteProjetById(id);
    }


    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }

    @PostMapping("/addProjet/{projetDetailId}")
    Projet addProjetAndAssignToDetail(@RequestBody Projet projet, @PathVariable Long projetDetailId) {
        return projetService.addProjetAndAssignProjetToProjetDetail(projet, projetDetailId);

    }

    @PutMapping("/desaffecter/{projetId}")
    Projet desaffecterProjetDetail(@PathVariable Long projetId) {
         return projetService.DesaffecterProjetDetailFromProjet(projetId);

    }

    @GetMapping("/findByDetailProjetTechnologie/technologie")
    List<Projet> findByDetailProjetTechnologie(@RequestParam String technologie) {
        return projetService.findByProjetDetailTechnologieLike(technologie);
    }

    @GetMapping("/finfByEquipe/{id_equipe}")
    List<Projet> finfByEquipe(@PathVariable long id_equipe) {
        return projetService.findByEquipe(id_equipe);
    }

    @GetMapping("/findBycoutAndTechnologie/{cout}/{technologie}")
    List<Projet>findByCoutAndTechnologie(@PathVariable Long cout, @PathVariable String technologie) {
        return projetService.findByCoutAndTechnologie(cout, technologie);
    }
}
