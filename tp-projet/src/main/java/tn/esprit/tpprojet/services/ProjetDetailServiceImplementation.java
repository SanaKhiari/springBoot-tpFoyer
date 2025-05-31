package tn.esprit.tpprojet.services;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.entities.ProjetDetail;
import tn.esprit.tpprojet.repository.ProjetDetailRepository;

import java.util.List;
@Service
@Slf4j
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
    //@Scheduled(fixedRate = 30000) // 30 seconde
    //@Scheduled(fixedDelay = 5000)
    //@Scheduled(cron = "0 * * * * *")//evry minute
    //@Scheduled(cron = "/15 * * * * * ")
    public List<ProjetDetail> retrieveAllProjetDetails() {
        List<ProjetDetail> listc=  projetDetailRepository.findAll();
        for (ProjetDetail dp : listc){
            System.out.println(dp);

        }
        return listc;
    }

    @Override
    public ProjetDetail retriveProjetDetailById(long id) {
        return projetDetailRepository.findById(id).get();
    }

    @Override
    public void deleteProjetDeatilById(long id) {
        projetDetailRepository.deleteById(id);
    }

    @Override
    public List<ProjetDetail> findByTechnologieLike(String technologie) {
        return projetDetailRepository.findByTechnologieLike("%"+ technologie + "%");
    }

    @Override
    public List<ProjetDetail> findByTechnologieContains(String technologie) {
        return projetDetailRepository.findByTechnologieContains( technologie );
    }


}
