package org.project.business.hepa.dto.request;

import lombok.*;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ADD_PROC_A0_RequestDTO {
    public String iACTKIND;
    public String iCMPYCD;
    public String iREQYM;
    public String iDEPTCD;
    public String iINYMD;
    public String iREQYMD;
    public String iREMARK;
    public String iREQGB;
    public String iREQ_USERID;
    public String iUPDEMP;

}
