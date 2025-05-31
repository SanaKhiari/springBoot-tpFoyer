package tn.esprit.tpfoyer.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;
    @PostMapping("/addReservation")
    Reservation  addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/getAllReservation")
    List<Reservation> getAllReservation() {
        return reservationService.retriveAllReservations();
    }

    @GetMapping("/getResrvationById/{id}")
    Reservation getReservationById(@PathVariable String id) {
        return reservationService.retrivetReservation(id);
    }

    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }
    @DeleteMapping("/deleteReservation/{id}")
    void deleteReservation(@PathVariable String id) {
        reservationService.deleteReservation(id);
    }
}
