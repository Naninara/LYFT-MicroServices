package com.LYFT.RideMicroService.Services;

import com.LYFT.RideMicroService.DAO.RideDAO;
import com.LYFT.RideMicroService.DTO.GetRideByEmailDTO;
import com.LYFT.RideMicroService.DTO.PersonalDetailsModel;
import com.LYFT.RideMicroService.Models.RideModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@Service
public class RideService {

    @Autowired
    RideDAO rideDAO;

    public ResponseEntity<String> addRide(RideModel inputModel){

        try{
            rideDAO.save(inputModel);

            return new ResponseEntity<>("Ride sucessfully posted", HttpStatus.CREATED);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }



    }

    public ResponseEntity<List<RideModel>> getAllUserRides(String email){
        try {
            List<RideModel> li = rideDAO.findAllByPostedEmail(email);
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }


    public  ResponseEntity<GetRideByEmailDTO> getRideDetailsByid(int id){
        try {
            RideModel foundRide = rideDAO.findById(id);

            PersonalDetailsModel ridePosterDetails = new RestTemplate().getForObject("http://localhost:8081/personaldetails/getdetailsByEmail?email="+foundRide.getPostedEmail(),PersonalDetailsModel.class);

            GetRideByEmailDTO response = new GetRideByEmailDTO(foundRide.getRideId(), foundRide.getStart(),  foundRide.getEnd(),foundRide.getDate(), foundRide.getPostedEmail(), foundRide.getTime(), foundRide.getRideAmount(),ridePosterDetails);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }

    }


}
