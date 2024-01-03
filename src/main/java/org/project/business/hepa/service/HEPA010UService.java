package org.project.business.hepa.service;

import org.project.mapper.hepa.HEPA010U_STR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HEPA010UService {
    private final HEPA010U_STR hepa010UStr;

    @Autowired
    public HEPA010UService(HEPA010U_STR hepa010UStr){
        this.hepa010UStr = hepa010UStr;
    }

//    public Optional<>
}
