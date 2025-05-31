package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    Etudiant retriveEtudiant(long id);
    void deleteEtudiant(long id);
    List<Etudiant> retriveAllEtudiants();
}
