package com.example.management_application.service.position;

import com.example.management_application.model.dto.res.PlayerResDto;
import com.example.management_application.model.dto.res.PositionResDto;

import java.util.List;

public interface IPostionService {
    List<PositionResDto> findAll();
}
