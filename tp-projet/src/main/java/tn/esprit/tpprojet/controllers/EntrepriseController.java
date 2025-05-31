package tn.esprit.tpprojet.controllers;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entities.Domaine;
import tn.esprit.tpprojet.entities.Entreprise;
import tn.esprit.tpprojet.services.EntrepriseServiceImplement;
import tn.esprit.tpprojet.services.IEntrepriseService;

import java.util.List;

@RestController
@RequestMapping("/entreprise")

public class EntrepriseController {
    @Autowired
    IEntrepriseService entrepriseService;
    @GetMapping("/retriveEntreprise/{adresse}")
    List<Entreprise> retriveEntreprise(@PathVariable("adresse") String adresse) {
        return entrepriseService.findByAdresse(adresse);

    }

    @GetMapping ("/RetriveEntrepriseByDomaine/{domaine}")
    List<Entreprise> retriveEntrepriseByDomaine(@PathVariable("domaine") Domaine domaine) {
        return entrepriseService.findByDomaine(domaine);
    }





}
