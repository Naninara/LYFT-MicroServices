package com.LYFT.authservice.Controller;


import com.LYFT.authservice.DAO.AuthDAO;
import com.LYFT.authservice.Model.AuthModel;
import com.LYFT.authservice.Services.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("oauth")
@CrossOrigin("*")
public class OAuthController {


    @Autowired
    AuthDAO authDAO;


    @Autowired
    OAuthService oAuthService;
    @PostMapping("signup")
    public ResponseEntity<String> registerUser(@RequestBody AuthModel signupData){
        return oAuthService.signup(signupData);




    }
}
