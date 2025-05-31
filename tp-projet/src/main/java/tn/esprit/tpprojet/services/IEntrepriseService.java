package tn.esprit.tpprojet.services;

import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.tpprojet.entities.Domaine;
import tn.esprit.tpprojet.entities.Entreprise;

import java.util.List;

public interface IEntrepriseService {
    List<Entreprise> findByAdresse(String adresse);
    List<Entreprise> findByDomaine(Domaine domaine);

    //@Override
    //@Transactional
    //public int update
    @Transactional
    int  adress(String adresse, Long id);
}
