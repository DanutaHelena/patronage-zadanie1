package pl.patronage.zadanie1.zadanie1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.patronage.zadanie1.zadanie1.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    private ParkingService parkingService;

    }

