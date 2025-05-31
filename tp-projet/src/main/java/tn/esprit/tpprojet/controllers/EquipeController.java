package tn.esprit.tpprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entities.Equipe;
import tn.esprit.tpprojet.services.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("/equipe")

public class EquipeController {
    @Autowired
    IEquipeService equipeService;


    @PostMapping("/addEquipe")
    Equipe addBloc(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }

    @GetMapping("/getAllEquipe")
    List<Equipe> getAllEquipe() {
        return equipeService.retrieveAllEquipe();
    }

    @GetMapping("/getEquipeById/{id}")
    Equipe getEquipeById(@PathVariable long id) {
        return equipeService.retriveEquipeById(id);
    }

    @PutMapping("/updateEquipe")
    Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }
    @DeleteMapping("/deleteEquipe/{id}")
    void deleteEquipe(@PathVariable long id) {
        equipeService.deleteEquipeById(id);
    }

    @PutMapping("/affecter-projet-a-equipe/{projet-id}/{equipe-id}")
    void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("equipe-id") Long equipeId) {
        equipeService.assignProjetToEquipe(proejtId, equipeId);
    }

    @PutMapping("/desaffecter/{projetId}/equipe/{equipeId}")
    void desaffecterProjetFromEquipe(@PathVariable Long projetId, @PathVariable Long equipeId) {
        equipeService.desaffecterProjetFromEquipe(projetId, equipeId);

    }

    @GetMapping("/findByNomAndProjetProjetDetailDescription/{nom}/{description}")
    List<Equipe> findByNomAndProjetProjetDetailDescription(@PathVariable String nom, @PathVariable String description) {
        return equipeService.findByNomAndProjetProjetDetailDescription(nom, description);
    }
    @GetMapping("/findBytchnologieAndDateDebut/{technologie}")
    List<Equipe> findBytchnologieAndDateDebut(@PathVariable String technologie){
        return equipeService.findBytchnologieAndDateDebut(technologie);
    }
}
