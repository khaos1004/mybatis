package org.project.common.login.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.project.common.login.dto.LoginResponseDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Mapper
public interface Hcom100Mapper {
    /**
     * 로그인
     */
    Optional<LoginResponseDTO> login(String cmpycd, String userid, String pw);

    /**
     *CRUD 통합 프로시저 메서드
     **/
    Map<String, Object> HCOM100_STR(
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

    /**
     *각각의 프로시저 메서드
     */
    List<LoginResponseDTO> selectRtn(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iNACD") String iNACD,
            @Param("iUSERID") String iUSERID
    );

    List<Object> selectListRtn(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iNACD") String iNACD,
            @Param("iUSERNM") String iUSERNM
    );

    String insertRtn(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iNACD") String iNACD
    );

    String updateRtn(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iNACD") String iNACD
    );

    String deleteRtn(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iNACD") String iNACD,
            @Param("iUSERID") String iUSERID
    );

}
