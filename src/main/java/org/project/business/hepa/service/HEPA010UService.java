package org.project.business.hepa.service;

import org.project.business.hepa.dto.request.*;
import org.project.business.hepa.dto.response.SEL_PROC_S0_ResponseDTO;
import org.project.business.hepa.mapper.Hepa010uMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HEPA010UService {
    private final Hepa010uMapper hepa010UStr;

    @Autowired
    public HEPA010UService(Hepa010uMapper hepa010UStr){
        this.hepa010UStr = hepa010UStr;
    }

    public void insertPurchase(ADD_PROC_A0_RequestDTO param){
        hepa010UStr.ADD_PROC_A0(param);
    }

    public String updatePurchase(UPD_PROC_U0_RequestDTO param){
        return hepa010UStr.UPD_PROC_U0(param);
    }

    public int deletePurchase(DEL_PROC_D0_RequestDTO param){
        return hepa010UStr.DEL_PROC_D0(param);
    }

    public List<SEL_PROC_S0_ResponseDTO> selectPurchase(SEL_PROC_S0_RequestDTO param){
        return hepa010UStr.SEL_PROC_S0(param);
    }

    public List<SEL_PROC_S0_ResponseDTO> prevPurchase(PREV_NEXT_PROC_P0_RequestDTO param){
        return hepa010UStr.PREV_PROC_P0(param);
    }

    public List<SEL_PROC_S0_ResponseDTO> nextPurchase(PREV_NEXT_PROC_P0_RequestDTO param){
        return hepa010UStr.NEXT_PROC_N0(param);
    }
}
