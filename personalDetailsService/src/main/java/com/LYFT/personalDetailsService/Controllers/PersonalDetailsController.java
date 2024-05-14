package com.LYFT.personalDetailsService.Controllers;


import com.LYFT.personalDetailsService.Models.PersonalDetailsModel;
import com.LYFT.personalDetailsService.Services.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personaldetails")
public class PersonalDetailsController {


    @Autowired
    PersonalDetailsService personalDetailsService;

    @PostMapping("/add")
    public ResponseEntity<PersonalDetailsModel> add(@RequestBody PersonalDetailsModel requestData){
        return personalDetailsService.add(requestData);
    }

    @GetMapping("/getUserDetails")
    public ResponseEntity<PersonalDetailsModel> getByEmail(@RequestParam String email){
        return personalDetailsService.findByEmail(email);
    }


}
