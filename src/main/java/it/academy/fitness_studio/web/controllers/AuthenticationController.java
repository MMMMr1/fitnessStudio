package it.academy.fitness_studio.web.controllers;

import it.academy.fitness_studio.core.dto.UserLoginDTO;
import it.academy.fitness_studio.core.dto.UserRegistrationDTO;
import it.academy.fitness_studio.service.api.IAuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class AuthenticationController {
    private IAuthenticationService service;

    public AuthenticationController(IAuthenticationService service) {
        this.service = service;
    }
    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    protected ResponseEntity<?> createUser(
            @RequestBody UserRegistrationDTO user) {
        service.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @RequestMapping( path = "/verification", method = RequestMethod.GET)
    protected ResponseEntity<?> verify(
            @RequestParam(name = "code", required = true) String code,
            @RequestParam(name = "mail", required = true) String mail)  {
        service.verify(mail,code);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
//    Получить информацию о пользователе
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody UserLoginDTO user) {
        service.login(user);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
//    @RequestMapping(path = "/me", method = RequestMethod.GET)
//    public UserEntity getUserInfo(@RequestBody UserLogin userLogin) {
//        return new UserEntity();
//    }
}
