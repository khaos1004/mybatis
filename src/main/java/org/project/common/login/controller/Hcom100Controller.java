package org.project.common.login.controller;

import org.project.common.login.dto.LoginRequestDTO;
import org.project.common.login.dto.LoginResponseDTO;
import org.project.common.login.service.Hcom100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Hcom100Controller {
    private final Hcom100Service hcom100Service;

    @Autowired
    public Hcom100Controller(Hcom100Service hcom100Service){
        this.hcom100Service = hcom100Service;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequestDTO){
        Optional<String> userId = hcom100Service.login(
                loginRequestDTO.getCOMPANYID(),
                loginRequestDTO.getUSERID(),
                loginRequestDTO.getPW()
        );
        return userId.map(data -> ResponseEntity.ok("Login successful: User ID is " + data)).orElseGet(() -> ResponseEntity.status(401).body("Login failed"));
    }
}
