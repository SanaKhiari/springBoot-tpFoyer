package tn.esprit.tpprojet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.tpprojet.entities.Domaine;
import tn.esprit.tpprojet.entities.Entreprise;
import tn.esprit.tpprojet.repository.EntrepriseRepository;

import java.util.List;

@Service


public class EntrepriseServiceImplement implements IEntrepriseService{

    @Autowired
    EntrepriseRepository entrepriseRepository;

    @Override
    public List<Entreprise> findByAdresse(String adresse) {
        return entrepriseRepository.findByAdresse(adresse);
    }

    @Override
    public List<Entreprise> findByDomaine(Domaine domaine) {
        return entrepriseRepository.findByDomaine(domaine);
    }

    //@Override
    //@Transactional
    //public int update
    @Transactional
    @Override
    public int  adress(String adresse, Long id)
    {
        return  entrepriseRepository.adress(adresse,id);
    }
}
