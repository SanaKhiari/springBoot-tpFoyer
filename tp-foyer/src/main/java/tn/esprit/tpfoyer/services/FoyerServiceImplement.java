package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Entities.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service

public class FoyerServiceImplement implements IFoyerService {
    @Autowired
    FoyerRepository foyerRepository;
    @Autowired
    BlocRepository blocRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer retriveFoyer(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteFoyer(long id) {
        foyerRepository.deleteById(id);

    }

    @Override
    public List<Foyer> retriveAllFoyers() {
        return foyerRepository.findAll();
    }

    //ne marche pas !!!!
    @Override
    public void affectBlocToFoyer(long idFoyer, List<Long> blocIds) {
        // Retrieve the Foyer by its ID
        Foyer foyer = foyerRepository.findById(idFoyer)
                .orElseThrow(() -> new RuntimeException("Foyer not found"));

        // Find all blocs by their IDs and add them to a set
        Set<Bloc> blocs = new HashSet<>();
        for (Long idBloc : blocIds) {
            Bloc bloc = blocRepository.findById(idBloc)
                    .orElseThrow(() -> new RuntimeException("Bloc with ID " + idBloc + " not found"));
            blocs.add(bloc);  // Add each bloc to the set
        }

        // Assign the set of blocs to the foyer
        foyer.setBlocs(blocs);  // Here we're using the instance method correctly

        // Save the updated foyer
        foyerRepository.save(foyer);
    }

}
