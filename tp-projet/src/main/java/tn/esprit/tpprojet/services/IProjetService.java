package tn.esprit.tpprojet.services;

import org.springframework.data.repository.query.Param;
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
    List<Projet> findByProjetDetailTechnologieLike(String technologie );
    List<Projet> findByEquipe(Long id_Equipe);

    List<Projet> findByCoutAndTechnologie( Long cout,  String technologie);

}
