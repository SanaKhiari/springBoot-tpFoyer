package tn.esprit.tpprojet.services;

import tn.esprit.tpprojet.entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    ProjetDetail updateProjetDetail(ProjetDetail projetDetail);
    List<ProjetDetail> retrieveAllProjetDetails();
    ProjetDetail retriveProjetDetailById(long id);
    void deleteProjetDeatilById(long id);
    List<ProjetDetail> findByTechnologieLike(String technologie);
    List<ProjetDetail> findByTechnologieContains(String technologie);
}
