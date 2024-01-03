package org.project.common.login.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import org.project.common.login.dto.DepartmentNmResponseDTO;
import org.project.common.login.dto.LoginRequestDTO;
import org.project.common.login.dto.LoginResponseDTO;
import org.project.common.login.service.Hcom100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<Optional<LoginResponseDTO>> login(@RequestBody LoginRequestDTO loginRequestDTO, HttpServletRequest request){

        Optional<LoginResponseDTO> userInfo = hcom100Service.login(
                loginRequestDTO.getCOMPANYID(),
                loginRequestDTO.getUSERID(),
                loginRequestDTO.getPW()
        );

        if (userInfo.isPresent()) {
            HttpSession session = request.getSession();
            session.setAttribute("loginMember", userInfo);

            LoginResponseDTO user = userInfo.get();
            Optional<DepartmentNmResponseDTO> departmentNmResponseDTO = hcom100Service.getDepartmentName(user.getDEPTCD());

            if(departmentNmResponseDTO.isPresent()) {
                DepartmentNmResponseDTO depart = departmentNmResponseDTO.get();
                user.setDEPTNM(depart.getDEPTNM());
            }

            return ResponseEntity.ok(userInfo);
        }

        return ResponseEntity.status(401).body(null);


    }//        return hcom100Service.login(
//            loginRequestDTO.getCOMPANYID(),
//            loginRequestDTO.getUSERID(),
//            loginRequestDTO.getPW())
//            .map(userId -> {
//                HttpSession session = request.getSession();
//                session.setAttribute("loginMember", userId);
//
//                LoginResponseDTO responseDTO = new LoginResponseDTO("Login successful", userId);
//                return ResponseEntity.ok(responseDTO);
//            })
//            .orElseGet(() -> ResponseEntity.status(401).body(new LoginResponseDTO("Login fail", null)));

    @GetMapping("/checkSession")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<String> checkSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false); // 기존 세션을 가져옵니다. 세션이 없으면 null 반환

        if (session != null && session.getAttribute("loginMember") != null) {
            // 세션이 존재하고, 로그인한 사용자의 정보가 세션에 있는 경우
            return ResponseEntity.ok("Session is valid");
        } else {
            // 세션이 없거나, 로그인한 사용자의 정보가 없는 경우
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Session is invalid or expired");
        }
    }


    @PostMapping("/logout")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public String logout(HttpSession session) {
        session.invalidate();
        return "logout!";
    }

    @PostMapping("/getDepartmentName")
    @CrossOrigin(origins ="http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<Optional<DepartmentNmResponseDTO>> getDepartment(@RequestBody DepartmentNmResponseDTO departmentNmResponseDTO) {
        Optional<DepartmentNmResponseDTO> department = hcom100Service.getDepartmentName(departmentNmResponseDTO.getDEPTCD());
        if (department.isPresent()) {
            return ResponseEntity.ok(department);
        }
        return ResponseEntity.status(401).body(null);
    }
}
