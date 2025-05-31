package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.List;

@Service

public class EtudiantServiceImplementation implements IEtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant retriveEtudiant(long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public void deleteEtudiant(long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public List<Etudiant> retriveAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
