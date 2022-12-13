package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Group;
import com.foxminded.universitycms.service.GroupService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(GroupController.class)
class GroupControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private GroupService groupService;

    @Test
    void showAllGroups_shouldContainExpectedModel_whenGetRequest() throws Exception {
        List<Group> groups = List.of(new Group(109, "109", new ArrayList<>()));

        given(groupService.findAll()).willReturn(groups);

        mvc.perform(get("/show-all-groups"))
                .andExpect(status().isOk())
                .andExpect(view().name("groups"))
                .andExpect(model().attributeExists("groups"))
                .andExpect(model().attribute("groups", groups));
    }
}
