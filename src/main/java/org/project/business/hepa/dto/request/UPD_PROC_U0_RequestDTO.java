package org.project.business.hepa.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UPD_PROC_U0_RequestDTO {
    private String iCMPYCD;
    private String iREQYM;
    private String iREQNO;
    private String iDEPTCD;
    private String iINYMD;
    private String iREQYMD;
    private String iREMARK;
    private String iREQ_USERID;
    private String iUPDEMP;
}
