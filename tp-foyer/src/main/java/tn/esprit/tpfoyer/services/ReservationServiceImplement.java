package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImplement implements IReservationService{
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation retrivetReservation(String id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public List<Reservation> retriveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);

    }
}
