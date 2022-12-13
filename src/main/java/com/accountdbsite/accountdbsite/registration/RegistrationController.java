package com.accountdbsite.accountdbsite.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // declares the class as a controller
@RequestMapping(path = "api/v1/registration") // maps every request to this path
@AllArgsConstructor // handles creating non-null constructors
public class RegistrationController {

    private RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
