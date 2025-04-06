package tn.esprit.tpprojet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.entities.Equipe;
import tn.esprit.tpprojet.entities.Projet;
import tn.esprit.tpprojet.repository.EquipeRepository;
import tn.esprit.tpprojet.repository.ProjetRepository;

import java.util.List;
@Service
public class EquipeServiceImplementation implements IEquipeService{
    //2eme methode (la preferable on travaille avec cette semestre)
    @Autowired
      EquipeRepository equipeRepository;
    @Autowired
    ProjetRepository projetRepository;
    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> retrieveAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retriveEquipeById(long id) {
        return equipeRepository.findById(id).get();
    }

    @Override
    public void deleteEquipeById(long id) {
        equipeRepository.deleteById(id);
    }
    @Override
    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjet().add(projet);
        equipeRepository.save(equipe);
    }

    @Override
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();

        equipe.getProjet().remove(projet);
        equipeRepository.save(equipe);

    }



}
