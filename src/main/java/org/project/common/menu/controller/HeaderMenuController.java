package org.project.common.menu.controller;

import org.project.common.menu.dto.HeaderMenuResponseDTO;
import org.project.common.menu.dto.SideMenuResponseDTO;
import org.project.common.menu.service.HeaderMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HeaderMenuController {
    private final HeaderMenuService headerMenuService;

    @Autowired
    public  HeaderMenuController(HeaderMenuService headerMenuService){
        this.headerMenuService = headerMenuService;
    }

    @PostMapping("/headermenu")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<List<HeaderMenuResponseDTO>> headermenu(){
        List<HeaderMenuResponseDTO> menu = headerMenuService.HeaderMenu();
        return ResponseEntity.ok(menu);
    }

    @PostMapping("/sidemenu")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<List<SideMenuResponseDTO>> sidemenu(){
        List<SideMenuResponseDTO> menu = headerMenuService.SideMenu();
        return ResponseEntity.ok(menu);
    }
}
