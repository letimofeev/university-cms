package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Building;
import com.foxminded.universitycms.service.BuildingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BuildingController {

    private final BuildingService buildingService;

    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @RequestMapping("/show-all-buildings")
    public String showAllBuildings(Model model) {
        List<Building> buildings = buildingService.findAll();
        model.addAttribute("allBuildings", buildings);
        return "all-buildings";
    }
}
