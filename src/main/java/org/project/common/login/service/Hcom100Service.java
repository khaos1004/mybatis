package org.project.common.login.service;

import org.project.common.login.dto.LoginRequestDTO;
import org.project.common.login.dto.LoginResponseDTO;
import org.project.common.login.mapper.Hcom100Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Hcom100Service {

    private final Hcom100Mapper hcom100Mapper;

    @Autowired
    public Hcom100Service(Hcom100Mapper hcom100Mapper){
        this.hcom100Mapper = hcom100Mapper;
    }

    public Optional<String> login(String cmpycd, String userid, String pw) {
        return hcom100Mapper.login(cmpycd, userid, pw);
    }
}
