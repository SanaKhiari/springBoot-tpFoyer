package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.Reservation;
import tn.esprit.tpfoyer.Entities.TypeChambre;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.ChambreRepository;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
//
//@AllArgsConstructor (1ére methode)
public class ChambreServiceImplement implements IChambreService {

    //2eme methode (la preferable on travaille avec cette semestre)
    @Autowired
    ChambreRepository chambreRepository;
    @Autowired
    BlocRepository blocRepository;
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> retriveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retriveChambre(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteChambre(long id) {
        chambreRepository.deleteById(id);

    }

    @Override
    public Chambre assignReservationToChambre(Long chambreId, String reservationId) {
        Chambre chambre = chambreRepository.findById(chambreId).get();
        Reservation reservation = reservationRepository.findById(reservationId).get();
        chambre.getReservations().add(reservation);
        return chambreRepository.save(chambre);
    }
    @Override
    public void desaffecterReservationDeChambre(Long idChambre, String idReservation) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        Reservation reservation = reservationRepository.findById(idReservation).get();
        chambre.getReservations().remove(reservation);
        chambreRepository.save(chambre);
    }

    @Override
    public Chambre findChambreByNumeroChambre(Long numC) {
        return chambreRepository.findChambreByNumeroChambre(numC);
    }

    @Override
    public List<Chambre> getTypeChambre(TypeChambre typeChambre) {
        return chambreRepository.findAllByTypeChambre(typeChambre);
    }

    @Override
    public Chambre getChambreByEtudiantCin(String cin) {
        return chambreRepository.findChambreByEtudiantCin(cin);
    }
}
