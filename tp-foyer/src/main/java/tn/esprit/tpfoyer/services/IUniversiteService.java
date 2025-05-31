package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    List<Universite> retrieveAllUniversites();
    Universite retriveUniversiteById(long id);
    void deleteUniversiteById(long id);
}
