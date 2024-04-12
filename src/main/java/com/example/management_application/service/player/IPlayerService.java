package com.example.management_application.service.player;

import com.example.management_application.model.dto.req.PlayerReqDto;
import com.example.management_application.model.dto.res.PlayerResDto;

import java.util.List;

public interface IPlayerService {
    PlayerResDto findById(Long id);
    List <PlayerResDto> findAll();
    void save(PlayerReqDto playerReqDto);
    void deleteById(Long id) throws Exception;
    void update(Long id, PlayerReqDto playerReqDto);
}
