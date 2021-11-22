package pl.patronage.zadanie1.zadanie1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

public class Parking {

    @Id
    private String parkingSpace;

    private Integer parkingNumber;

    private Integer parkingStorey;

    private String disabledParkingSpace;

}