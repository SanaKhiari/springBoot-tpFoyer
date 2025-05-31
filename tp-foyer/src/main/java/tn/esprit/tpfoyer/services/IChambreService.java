package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre (Chambre chambre);
    Chambre updateChambre (Chambre chambre);
    List<Chambre> retriveAllChambre();
    Chambre retriveChambre (long id);
    void deleteChambre (long id);

    //Chambre assignChambreToFoyer(Long idChambre, Long idBloc);

    Chambre assignReservationToChambre(Long chambreId, String reservationId);

    void desaffecterReservationDeChambre(Long idChambre, String idReservation);

    Chambre findChambreByNumeroChambre(Long numC);



    List<Chambre> getTypeChambre(TypeChambre typeChambre);

    Chambre getChambreByEtudiantCin(String cin);
}
