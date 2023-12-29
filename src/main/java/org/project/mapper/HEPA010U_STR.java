package org.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.project.common.login.dto.LoginResponseDTO;

import java.util.List;

@Mapper
public interface HEPA010U_STR {
    String ADD_PROC_A0(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iREQYM") String iREQYM,
            @Param("iREQNO") String iREQNO,
            @Param("iDEPTCD") String iDEPTCD,
            @Param("iINYMD") String iINYMD,
            @Param("iREQYMD") String iREQYMD,
            @Param("iREMARK") String iREMARK,
            @Param("iREQGB") String iREQGB,
            @Param("iREQ_USERID") String iREQ_USERID,
            @Param("iUPDEMP") String iUPDEMP
    );

    String UPD_PROC_U0(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iREQYM") String iREQYM,
            @Param("iREQNO") String iREQNO,
            @Param("iDEPTCD") String iDEPTCD,
            @Param("iINYMD") String iINYMD,
            @Param("iREQYMD") String iREQYMD,
            @Param("iREMARK") String iREMARK,
            @Param("iREQGB") String iREQGB,
            @Param("iREQ_USERID") String iREQ_USERID,
            @Param("iUPDEMP") String iUPDEMP
    );

    String DEL_PROC_D0(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iREQYM") String iREQYM,
            @Param("iREQNO") String iREQNO
    );

    List<Object> SEL_PROC_S0(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iREQYM") String iREQYM,
            @Param("iREQNO") String iREQNO,
            @Param("iREQGB") String iREQGB
    );

    void PREV_PROC_P0(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iREQYM") String iREQYM,
            @Param("iREQNO") String iREQNO,
            @Param("iREQGB") String iREQGB
    );

    void NEXT_PROC_N0(
            @Param("iCMPYCD") String iCMPYCD,
            @Param("iREQYM") String iREQYM,
            @Param("iREQNO") String iREQNO,
            @Param("iREQGB") String iREQGB
    );

}
