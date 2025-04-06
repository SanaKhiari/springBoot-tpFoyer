package tn.esprit.tpprojet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.entities.ProjetDetail;
import tn.esprit.tpprojet.repository.ProjetDetailRepository;

import java.util.List;
@Service
public class ProjetDetailServiceImplementation implements IProjetDetailService{
    @Autowired
    ProjetDetailRepository projetDetailRepository;
    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public List<ProjetDetail> retrieveAllProjetDetails() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail retriveProjetDetailById(long id) {
        return projetDetailRepository.findById(id).get();
    }

    @Override
    public void deleteProjetDeatilById(long id) {
        projetDetailRepository.deleteById(id);
    }
}
