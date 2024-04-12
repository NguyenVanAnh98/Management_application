package com.example.management_application.service.player;

import com.example.management_application.model.Location;
import com.example.management_application.model.Player;
import com.example.management_application.model.Position;
import com.example.management_application.model.dto.req.PlayerReqDto;
import com.example.management_application.model.dto.res.PlayerResDto;
import com.example.management_application.repo.ILocationrepository;
import com.example.management_application.repo.IPlayerRepository;
import com.example.management_application.repo.IPositionRepository;
import com.example.management_application.service.location.ILocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService implements IPlayerService{
   private final IPlayerRepository playerRepository;
//   private  final IPlayerService playerService;
   private  final ILocationrepository locationRepository;
   private final IPositionRepository positionRepository;
    @Override
    public PlayerResDto findById(Long id) {
        PlayerResDto playerResDto = new PlayerResDto();
        Player player = playerRepository.findById(id).get();
        playerResDto.setId(player.getId());
        playerResDto.setName(player.getName());
        playerResDto.setDateofBirth(player.getDateofBirth());
        playerResDto.setExperience(player.getExperience());


        return playerResDto;
    }

    @Override
    public List<PlayerResDto> findAll() {
        List<Player> players = playerRepository.findAll();
        List<PlayerResDto> playerResDtos = new ArrayList<>();
        for (Player player : players) {
            PlayerResDto playerResDto = new PlayerResDto();
            playerResDto.setId(player.getId());
            playerResDto.setName(player.getName());
            playerResDto.setDateofBirth(player.getDateofBirth());
            playerResDto.setExperience(player.getExperience());

            // chuyen doi position thanh positionResDto
            playerResDto.setPosition(player.getPosition().toPositionResDto());
            playerResDto.setLocation(player.getLocation().toLocationResDto());

            playerResDtos.add(playerResDto);
        }
        return playerResDtos;
    }

    @Override
    public void save(PlayerReqDto playerReqDto) {
        // save location
        Location location = new Location();
        location.setAddress(playerReqDto.getAddress());
        location.setProvinceId(playerReqDto.getProvinceId());
        location.setProvinceName(playerReqDto.getProvinceName());
        location.setDistrictId(playerReqDto.getDistrictId());
        location.setDistrictName(playerReqDto.getDistrictName());
        location.setWardId(playerReqDto.getWardId());
        location.setWardName(playerReqDto.getWardName());

        locationRepository.save(location);

        // lay thong tin vi tri
        Position position = positionRepository.findById(playerReqDto.getPositionId()).get();

        Player player = new Player();
        player.setLocation(location);
        player.setName(playerReqDto.getName());
        player.setDateofBirth(playerReqDto.getDob());
        player.setExperience(playerReqDto.getExperience());
        player.setPosition(position);
        playerRepository.save(player);

    }

    @Override
    public void deleteById(Long id) throws Exception {
        playerRepository.deleteById(id);

    }

    @Override
    public void update(Long id, PlayerReqDto playerReqDto) {
        Player player = playerRepository.findById(id).get();
        player.setName(playerReqDto.getName());
//        player.setDateofBirth(playerReqDto.getDateofBirth());
        player.setExperience(playerReqDto.getExperience());
//        player.setPosition(playerRepository.findById(playerReqDto.getPositionId()).get());
//        player.setLocation(playerRepository.findById(playerReqDto.getLocationId()).get());
        playerRepository.save(player);

    }
}
