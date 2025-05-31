package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Entities.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
public class BlocServiceImplement implements IBlocService {
    @Autowired
    BlocRepository blocRepository;
    @Autowired
    FoyerRepository foyerRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retriveBlocById(long id) {
        return blocRepository.findById(id).get();
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public void assignBlocToFoyer(Long idBloc, Long idFoyer) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        Foyer foyer = foyerRepository.findById(idFoyer).get();
// on set le fils dans le parent :
        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }
    @Override
    public void unassignBlocFromFoyer(Long idBloc, Long idFoyer) {
        // Récupérer le Foyer depuis la base de données
        Foyer foyer = foyerRepository.findById(idFoyer).get();

        // Récupérer le Bloc depuis la base de données
        Bloc bloc = blocRepository.findById(idBloc).get();
        //foyer.getBlocs().remove(bloc);
        //bloc.getFoyer().getBlocs().remove(bloc);
        bloc.setFoyer(null);
        foyerRepository.save(foyer);
    }

    @Override
    public List<Bloc> getlistenull() {
        return blocRepository.findAllByFoyerIsNull();
    }

    @Override
    public List<Bloc> getBlocsByCapaciteBlocGreaterThan(int capaciteBloc) {
        return blocRepository.getBlocsByCapaciteBlocGreaterThan(capaciteBloc);
    }
}
