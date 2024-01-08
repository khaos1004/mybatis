package org.project.common.menu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.project.common.menu.dto.HeaderMenuResponseDTO;
import org.project.common.menu.dto.SideMenuResponseDTO;

import java.util.List;

@Mapper
public interface Hcom900Mapper {
    List<HeaderMenuResponseDTO> headerMenu();

    List<SideMenuResponseDTO> sideMenu();
}
