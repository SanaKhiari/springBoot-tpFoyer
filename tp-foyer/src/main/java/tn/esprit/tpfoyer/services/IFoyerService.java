package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    Foyer retriveFoyer(long id);
    void deleteFoyer(long id);
    List<Foyer> retriveAllFoyers();
    void affectBlocToFoyer(long idFoyer, List<Long> blocIds);
}
