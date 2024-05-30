package com.LYFT.RideMicroService.Controllers;


import com.LYFT.RideMicroService.DTO.GetRideByEmailDTO;
import com.LYFT.RideMicroService.Models.RideModel;
import com.LYFT.RideMicroService.Services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ride")
public class RideController {


    @Autowired
    RideService rideService;

    @PostMapping("add")
    public ResponseEntity<String> addRide(@RequestBody RideModel input){

        try{
            return rideService.addRide(input);
        }
        catch (Exception e){
            return new ResponseEntity<>("Something went wrong",HttpStatus.BAD_REQUEST);
        }


    }

    @GetMapping("/getRidesByEmail")
    public ResponseEntity<List<RideModel>> getRidesByUserEmail(@RequestParam String email){
        try {

            rideService.getAllUserRides(email);
            return rideService.getAllUserRides(email);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/getrideDetails")
    public ResponseEntity<GetRideByEmailDTO> getRideByEmail(@RequestParam int id){
        try {
            return  rideService.getRideDetailsByid(id);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
}
