package org.project.common.menu.service;

import org.project.common.menu.dto.HeaderMenuResponseDTO;
import org.project.common.menu.dto.SideMenuResponseDTO;
import org.project.common.menu.mapper.Hcom900Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeaderMenuService {
    private final Hcom900Mapper hcom900Mapper;

    @Autowired
    public HeaderMenuService(Hcom900Mapper hcom900Mapper){
        this.hcom900Mapper = hcom900Mapper;
    }

    public List<HeaderMenuResponseDTO> HeaderMenu(){
        return hcom900Mapper.headerMenu();
    }

    public List<SideMenuResponseDTO> SideMenu(){
        return hcom900Mapper.sideMenu();
    }

}
