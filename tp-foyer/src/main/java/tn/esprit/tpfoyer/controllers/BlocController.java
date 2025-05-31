package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Entities.Reservation;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")

public class BlocController {
    @Autowired
    IBlocService blocService;

    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("/getAllBloc")
    List<Bloc> getAllBloc() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/getBlocById/{id}")
    Bloc getBlocById(@PathVariable long id) {
        return blocService.retriveBlocById(id);
    }

    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @DeleteMapping("/deleteBloc/{id}")
    void deleteBloc(@PathVariable long id) {
        blocService.deleteBlocById(id);
    }


    @PutMapping("/affecter-blocç-a-foyer/{bloc-id}/{foyer-id}")
    public void assignBlocToFoyer(@PathVariable("bloc-id") Long idBloc,
                                  @PathVariable("foyer-id") Long idFoyer) {
        blocService.assignBlocToFoyer(idBloc, idFoyer);

    }

    @PutMapping("/desaffecter-bloc-de-foyer/{bloc-id}/{foyer-id}")
    public void unassignBlocFromFoyer(@PathVariable("bloc-id") Long idBloc,
                                      @PathVariable("foyer-id") Long idFoyer) {
        blocService.unassignBlocFromFoyer(idBloc, idFoyer);
    }

    @GetMapping("/afficheBlocsNonAffects")
    public List<Bloc> getlistenull() {
        return blocService.getlistenull();
    }

    @GetMapping("/capacite-sup/{capacite}")
    public List<Bloc> getBlocsByCapaciteSup(@PathVariable("capacite") int capaciteBloc) {
        return blocService.getBlocsByCapaciteBlocGreaterThan(capaciteBloc);


    }
}
