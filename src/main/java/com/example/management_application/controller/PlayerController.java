package com.example.management_application.controller;

import com.example.management_application.model.dto.req.PlayerReqDto;
import com.example.management_application.model.dto.res.PlayerResDto;
import com.example.management_application.service.player.IPlayerService;
import com.example.management_application.service.player.PlayerService;
import com.example.management_application.service.position.IPostionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {
    /*
    Viêt bang thymeleaf:
    Viet bang api
     */

    @Autowired
    private IPlayerService playerService;
    @Autowired
    private IPostionService postionService;
    @GetMapping
    public String showPlayers(Model model) {
        List<PlayerResDto> playerResDto = playerService.findAll();

        model.addAttribute("players", playerResDto);
        return "players";
    }


    @GetMapping("/add")
    public String showAddPlayer(Model model) {
        model.addAttribute("positions", postionService.findAll());
        return "add-player";
    }

    @PostMapping("/add")
    public String savePlayer(PlayerReqDto playerReqDto) {
        playerService.save(playerReqDto);
        return "redirect:/players";
    }
}
