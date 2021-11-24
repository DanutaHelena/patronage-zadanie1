package pl.patronage.zadanie1.zadanie1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@EntityScan
public class Parking {

    @Id
    private String id;

    private Integer parkingNumber;

    private Integer parkingStorey;

    private enum parkingType {
        DISABLED, FAMILY, ALL
    }

}