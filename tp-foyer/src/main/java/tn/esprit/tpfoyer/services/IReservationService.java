package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    Reservation retrivetReservation(String id);
    List<Reservation> retriveAllReservations();
    void deleteReservation(String id);

}
