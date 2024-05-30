package com.LYFT.SearchMicroService.Service;


import com.LYFT.SearchMicroService.DAO.SearchDAO;
import com.LYFT.SearchMicroService.DTO.InputDTO;
import com.LYFT.SearchMicroService.Models.RideModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    SearchDAO searchDAO;
    public ResponseEntity<List<RideModel>>  searchrides(InputDTO inputDTO){

        try{
            List<RideModel> li = searchDAO.getRides(inputDTO.getStart(),inputDTO.getEnd(),inputDTO.getDate());
            return new ResponseEntity<>(li, HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }



    }
}
