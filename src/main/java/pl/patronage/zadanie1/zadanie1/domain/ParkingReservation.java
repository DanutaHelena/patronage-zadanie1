package pl.patronage.zadanie1.zadanie1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ParkingReservation {

    @Id
    private Integer id;
}
