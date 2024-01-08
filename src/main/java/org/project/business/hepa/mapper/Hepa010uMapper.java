package org.project.business.hepa.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.project.business.hepa.dto.request.*;
import org.project.business.hepa.dto.response.SEL_PROC_S0_ResponseDTO;

import java.util.List;
import java.util.Map;

@Mapper
public interface Hepa010uMapper {
    int ADD_PROC_A0( ADD_PROC_A0_RequestDTO param );

    String UPD_PROC_U0( UPD_PROC_U0_RequestDTO param );

    int DEL_PROC_D0(DEL_PROC_D0_RequestDTO param );

    List<SEL_PROC_S0_ResponseDTO> SEL_PROC_S0(SEL_PROC_S0_RequestDTO param );

    List<SEL_PROC_S0_ResponseDTO> PREV_PROC_P0( PREV_NEXT_PROC_P0_RequestDTO param );

    List<SEL_PROC_S0_ResponseDTO> NEXT_PROC_N0( PREV_NEXT_PROC_P0_RequestDTO param );

//    @Delete("DELETE FROM HPRO100_TBL WHERE CMPYCD = #{iCMPYCD} AND REQYM = #{iREQYM} AND REQNO = #{iREQNO}")
//    int DEL_PROC_D0(DEL_PROC_D0_RequestDTO param);
}
