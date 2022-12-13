package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Building;
import com.foxminded.universitycms.model.Classroom;
import com.foxminded.universitycms.service.BuildingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BuildingController.class)
class BuildingControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private BuildingService buildingService;

    @Test
    void showAllBuildings_shouldContainExpectedModel_whenGetRequest() throws Exception {
        List<Building> buildings = List.of(new Building(1, "One", List.of(new Classroom()), "Address1"));

        given(buildingService.findAll()).willReturn(buildings);

        mvc.perform(get("/show-all-buildings"))
                .andExpect(status().isOk())
                .andExpect(view().name("buildings"))
                .andExpect(model().attributeExists("buildings"))
                .andExpect(model().attribute("buildings", buildings));
    }
}
