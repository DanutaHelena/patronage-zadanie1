package pl.patronage.zadanie1.zadanie1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.patronage.zadanie1.zadanie1.domain.Reservation;
import pl.patronage.zadanie1.zadanie1.model.ReservationRequest;
import pl.patronage.zadanie1.zadanie1.service.ReservationService;

@RestController
@RequestMapping("api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation createReservation(@RequestBody ReservationRequest reservationRequest) {
        return reservationService.createReservation(reservationService);

    }

}
