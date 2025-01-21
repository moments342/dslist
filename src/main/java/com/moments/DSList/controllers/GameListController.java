package com.moments.DSList.controllers;

import com.moments.DSList.DTO.GameDTO;
import com.moments.DSList.DTO.GameListDTO;
import com.moments.DSList.DTO.GameMinDTO;
import com.moments.DSList.services.GameListService;
import com.moments.DSList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
}
