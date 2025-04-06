package tn.esprit.tpprojet.services;

import tn.esprit.tpprojet.entities.Projet;

import java.util.List;

public interface IProjetService {
    Projet addProjet(Projet projet);
    Projet updateProjet(Projet projet);
    List<Projet> retrieveAllProjets();
    Projet retriveProjetById(long id);
    void deleteProjetById(long id);
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId);
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId);
    public Projet DesaffecterProjetDetailFromProjet(Long projetId);

}
