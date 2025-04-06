package tn.esprit.tpprojet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.entities.Equipe;
import tn.esprit.tpprojet.entities.Projet;
import tn.esprit.tpprojet.entities.ProjetDetail;
import tn.esprit.tpprojet.repository.EquipeRepository;
import tn.esprit.tpprojet.repository.ProjetDetailRepository;
import tn.esprit.tpprojet.repository.ProjetRepository;

import java.util.List;

@Service

public class ProjetServiceImplementation implements IProjetService{
    @Autowired
    ProjetRepository projetRepository;
    @Autowired
    ProjetDetailRepository projetDetailRepository;
    @Autowired
    EquipeRepository equipeRepository;
    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public List<Projet> retrieveAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retriveProjetById(long id) {
        return projetRepository.findById(id).get();
    }

    @Override
    public void deleteProjetById(long id) {
        projetRepository.deleteById(id);
    }

    //@Override
    //public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
      //  Projet projet = projetRepository.findById(projetId).get();
        //ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
        //projet.setProjetDetail(projetDetail);
        //projetRepository.save(projet);
    //}
    @Override
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId)
                .orElseThrow(() -> new RuntimeException("Projet not found with ID: " + projetId));

        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId)
                .orElseThrow(() -> new RuntimeException("ProjetDetail not found with ID: " + projetDetailId));

        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }
    @Override
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }
    @Override
    public Projet DesaffecterProjetDetailFromProjet(Long projetId) {
        Projet projet = projetRepository.findById(projetId).get();
        projet.setProjetDetail(null);
        return projetRepository.save(projet);
    }


}
