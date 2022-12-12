package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Classroom;
import com.foxminded.universitycms.service.ClassroomService;
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
@WebMvcTest(ClassroomController.class)
class ClassroomControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ClassroomService classroomService;

    @Test
    void showAllClassrooms_shouldContainExpectedModel_whenGetRequest() throws Exception {
        List<Classroom> classrooms = List.of(new Classroom(1, 200), new Classroom(4, 300));

        given(classroomService.findAll()).willReturn(classrooms);

        mvc.perform(get("/show-all-classrooms"))
                .andExpect(status().isOk())
                .andExpect(view().name("classrooms"))
                .andExpect(model().attributeExists("classrooms"))
                .andExpect(model().attribute("classrooms", classrooms));
    }
}
