package org.project.business.hepa.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.project.business.hepa.dto.request.*;
import org.project.business.hepa.dto.response.SEL_PROC_S0_ResponseDTO;
import org.project.business.hepa.service.HEPA010UService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Hepa010uController {
    private final HEPA010UService hepa010UService;

    @Autowired
    public Hepa010uController(HEPA010UService hepa010UService){
        this.hepa010UService = hepa010UService;
    }

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<?> ADD_PROC_A0(@RequestBody ADD_PROC_A0_RequestDTO param){
        try {
            System.out.println(param);
            hepa010UService.insertPurchase(param);
            return new ResponseEntity<>("Insert successful", HttpStatus.CREATED);
        } catch (Exception e) {
            // 로깅
            // logger.error("Insert failed", e);
            return new ResponseEntity<>("Insert failed: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/UPD_PROC_U0")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<?> UPD_PROC_U0(@RequestBody UPD_PROC_U0_RequestDTO param){
        try {
            hepa010UService.updatePurchase(param);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            // 로깅
            // logger.error("Insert failed", e);
            return new ResponseEntity<>("Update failed: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/del")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    @Transactional
    public ResponseEntity<?> DEL_PROC_D0(@RequestBody DEL_PROC_D0_RequestDTO param){
        try {
            System.out.println("넘어온 파라메터:" + param);
            int deletedRows = hepa010UService.deletePurchase(param);
            if (deletedRows > 0) {
                // 성공적으로 삭제된 경우
                return new ResponseEntity<>(deletedRows + " rows deleted.", HttpStatus.OK);
            } else {
                // 삭제할 행이 없었던 경우
                return new ResponseEntity<>("No rows deleted.", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            // 로깅
            // logger.error("Delete failed", e);
            return new ResponseEntity<>("delete failed: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/SEL_PROC_S0")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<List<SEL_PROC_S0_ResponseDTO>> SEL_PROC_S0(@RequestBody SEL_PROC_S0_RequestDTO param){
        try {
            List<SEL_PROC_S0_ResponseDTO> data =  hepa010UService.selectPurchase(param);
            return ResponseEntity.ok(data);
        } catch (Exception e) {
            // 로깅
            // logger.error("Insert failed", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/PREV_PROC_P0")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<List<SEL_PROC_S0_ResponseDTO>> PREV_PROC_P0(@RequestBody PREV_NEXT_PROC_P0_RequestDTO param){
        try {
            List<SEL_PROC_S0_ResponseDTO> data =  hepa010UService.prevPurchase(param);
            return ResponseEntity.ok(data);
        } catch (Exception e) {
            // 로깅
            // logger.error("Insert failed", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/NEXT_PROC_N0")
    @CrossOrigin(origins = "http://localhost:8081", allowCredentials = "true")
    public ResponseEntity<List<SEL_PROC_S0_ResponseDTO>> NEXT_PROC_N0(@RequestBody PREV_NEXT_PROC_P0_RequestDTO param){
        try {
            List<SEL_PROC_S0_ResponseDTO> data =  hepa010UService.nextPurchase(param);
            return ResponseEntity.ok(data);
        } catch (Exception e) {
            // 로깅
            // logger.error("Insert failed", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
