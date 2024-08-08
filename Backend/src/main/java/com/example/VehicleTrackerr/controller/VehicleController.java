package com.example.VehicleTrackerr.controller;


import com.example.VehicleTrackerr.modal.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class VehicleController {

    @GetMapping("/api/vehicle/route")
    public List<Location> getVehicleRoute() {
        //  dummy data for the vehicle's route
        return Arrays.asList(
                new Location(19.9975, 73.7898, LocalDateTime.parse("2024-07-20T10:00:00")),
                new Location(18.5204, 73.8567, LocalDateTime.parse("2024-07-20T10:00:05")),
                new Location(19.8849, 74.4728, LocalDateTime.parse("2024-07-20T10:00:10"))

        );
    }
}
