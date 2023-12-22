package org.project.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface Hcom100Mapper {
    Map<String, Object> executeUserProcedure(
            @Param("iACTKIND") String iACTKIND,
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iNACD") String iNACD,
            @Param("iUSERID") String iUSERID,
            @Param("iUSERNM") String iUSERNM,
            @Param("iDEPTCD") String iDEPTCD,
            @Param("iDEPTNM") String iDEPTNM,
            @Param("iEMPNO") String iEMPNO,
            @Param("iSALSYN") String iSALSYN,
            @Param("iPW") String iPW,
            @Param("iTELNO") String iTELNO,
            @Param("iHPNO") String iHPNO,
            @Param("iEMAIL") String iEMAIL,
            @Param("iSDEPT") String iSDEPT,
            @Param("iUSEYN") String iUSEYN,
            @Param("iUSERGRP") String iUSERGRP,
            @Param("iPOSITION") String iPOSITION,
            @Param("iUPDEMP") String iUPDEMP
    );
}
