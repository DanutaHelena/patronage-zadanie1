package pl.patronage.zadanie1.zadanie1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.patronage.zadanie1.zadanie1.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
