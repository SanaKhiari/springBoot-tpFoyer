package tn.esprit.tpfoyer.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.TypeChambre;
import tn.esprit.tpfoyer.services.ChambreServiceImplement;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;
@Tag(name = "gestion des chambres")
@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired //pour que dans la base ne get pas des nulls
    IChambreService chambreService ;

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @GetMapping("/getAllChambre")
    List<Chambre> getAllChambre() {
        return chambreService.retriveAllChambre();
    }

    @GetMapping("/getChambre/{idChambre}")
    Chambre getChambre(@PathVariable long idChambre) {
        return chambreService.retriveChambre(idChambre);
    }

    @PutMapping("/updateChambre")
    Chambre updateChambre( @RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @DeleteMapping("/deleteChambre/{idChambre}")
    void deleteChambre(@PathVariable("idChambre") long idChambre) { // si on veu changer le nom des paremetre passer pour ester et le parametre de la methode
        chambreService.deleteChambre(idChambre);
    }

    @PostMapping("/assigner-reservation/{chambreId}/{reservationId}")
    public Chambre assignReservationToChambre(
            @PathVariable Long chambreId,
            @PathVariable String reservationId) {
        return chambreService.assignReservationToChambre(chambreId, reservationId);
    }
    @PutMapping("/desaffecter-reservation/{idChambre}/{idReservation}")
    public void desaffecterReservationDeChambre(@PathVariable Long idChambre, @PathVariable String idReservation) {
        chambreService.desaffecterReservationDeChambre(idChambre, idReservation);
    }

    @GetMapping("/getChambre/{typeChambre}")
    public List<Chambre> getTypeChambre(@PathVariable TypeChambre typeChambre)
    {
        return  chambreService.getTypeChambre(typeChambre);
    }
    @GetMapping("/findChambreByNumero/{num}")
    public Chambre findChambreByNumeroChambre(Long numC){
        return chambreService.findChambreByNumeroChambre(numC);
    }


    @GetMapping("/etudiant/{cin}")
    public Chambre getChambreByEtudiantCin(@PathVariable("cin") String cin) {
        return chambreService.getChambreByEtudiantCin(cin);
    }


}
