package tn.esprit.tpprojet.services;

import org.springframework.data.repository.query.Param;
import tn.esprit.tpprojet.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    List<Equipe> retrieveAllEquipe();
    Equipe retriveEquipeById(long id);
    void deleteEquipeById(long id);
    public void assignProjetToEquipe(Long projetId, Long equipeId);
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId);
    List<Equipe> findByNomAndProjetProjetDetailDescription(String nom, String Description);
    List<Equipe> findBytchnologieAndDateDebut(String technologie);

}
