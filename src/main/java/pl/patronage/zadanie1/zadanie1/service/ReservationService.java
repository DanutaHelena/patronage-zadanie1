package pl.patronage.zadanie1.zadanie1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.patronage.zadanie1.zadanie1.domain.Parking;
import pl.patronage.zadanie1.zadanie1.domain.Reservation;
import pl.patronage.zadanie1.zadanie1.model.ReservationRequest;
import pl.patronage.zadanie1.zadanie1.repository.ReservationRepository;

import java.util.Collections;

@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public Reservation createReservation(ReservationService reservationRequest) {
        Parking parking = (Parking) reservationRepository.findAllById(Collections.singleton(""));

    }
}
