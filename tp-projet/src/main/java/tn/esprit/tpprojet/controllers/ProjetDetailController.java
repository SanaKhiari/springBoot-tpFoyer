package tn.esprit.tpprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entities.Equipe;
import tn.esprit.tpprojet.entities.ProjetDetail;
import tn.esprit.tpprojet.services.IEquipeService;
import tn.esprit.tpprojet.services.IProjetDetailService;
import tn.esprit.tpprojet.services.ProjetDetailServiceImplementation;

import java.util.List;

@RestController
@RequestMapping("/projetDetail")
public class ProjetDetailController {
    @Autowired
    IProjetDetailService projetDetailService;


    @PostMapping("/addProjetDetail")
    ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.addProjetDetail(projetDetail);
    }

    @GetMapping("/getAllProjetDetail")
    List<ProjetDetail> getAllProjetDetail() {
        return projetDetailService.retrieveAllProjetDetails();
    }

    @GetMapping("/getprojetDetailById/{id}")
    ProjetDetail getEquipeById(@PathVariable long id) {
        return projetDetailService.retriveProjetDetailById(id);
    }

    @PutMapping("/updateEquipe")
    ProjetDetail updateProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.updateProjetDetail(projetDetail);
    }
    @DeleteMapping("/deleteProjetDetail/{id}")
    void deleteBloc(@PathVariable long id) {
        projetDetailService.deleteProjetDeatilById(id);
    }
}
