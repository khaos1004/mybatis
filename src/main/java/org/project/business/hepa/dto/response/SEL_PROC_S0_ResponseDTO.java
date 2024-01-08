package org.project.business.hepa.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class SEL_PROC_S0_ResponseDTO {
    private String iREQYM;
    private String iREQNO;
    private String iDEPTCD;
    private String iINYMD;
    private String iREQYMD;
    private String iREMARK;
    private String DEPTNM;
    private String USERNM;
    private String iREQ_USERID;
}
