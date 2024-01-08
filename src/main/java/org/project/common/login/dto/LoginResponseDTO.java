package org.project.common.login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDTO {
    private String USERID;
    private String USERNM;
    private String DEPTCD;
    private String DEPTNM;
    private String CMPYCD;
    private String NACD;
}
