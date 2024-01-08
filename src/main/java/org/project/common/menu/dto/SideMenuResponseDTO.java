package org.project.common.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class SideMenuResponseDTO {
    private String GRPCD;
    private String GRPNM;
    private String PGMID;
    private String PGMNM;
}
