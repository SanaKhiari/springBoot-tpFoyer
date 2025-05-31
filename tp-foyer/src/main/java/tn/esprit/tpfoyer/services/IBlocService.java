package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    List<Bloc> retrieveAllBlocs();
    Bloc retriveBlocById(long id);
    void deleteBlocById(long id);

    void assignBlocToFoyer(Long idBloc, Long idFoyer);

    void unassignBlocFromFoyer(Long idBloc, Long idFoyer);

    List<Bloc> getlistenull();
    List<Bloc> getBlocsByCapaciteBlocGreaterThan(int capaciteBloc);
}
