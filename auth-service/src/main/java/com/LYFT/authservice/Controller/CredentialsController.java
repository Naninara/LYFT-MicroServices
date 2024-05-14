package com.LYFT.authservice.Controller;


import com.LYFT.authservice.DTO.SignInDto;
import com.LYFT.authservice.Model.CredentailsRequestModel;
import com.LYFT.authservice.Model.SignInRequestModel;
import com.LYFT.authservice.Services.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("credentials")
public class CredentialsController {


    @Autowired
    CredentialService credentialService;

    @PostMapping("signup")
    public ResponseEntity<String> signup(@RequestBody CredentailsRequestModel input){
        return credentialService.signupUsingCredentials(input);
    }


    @PostMapping("signin")
    public ResponseEntity<SignInDto> signIn(@RequestBody SignInRequestModel requestData){
        return credentialService.signIn(requestData);
    }
}
