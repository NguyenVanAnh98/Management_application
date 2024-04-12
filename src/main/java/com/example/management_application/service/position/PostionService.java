package com.example.management_application.service.position;

import com.example.management_application.model.dto.res.PositionResDto;
import com.example.management_application.repo.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostionService implements IPostionService {


    @Autowired
    private IPositionRepository positionRepository;
    @Override
    public List<PositionResDto> findAll() {
        return positionRepository.findAll().stream().map(position -> position.toPositionResDto()).collect(Collectors.toList());
    }
}
