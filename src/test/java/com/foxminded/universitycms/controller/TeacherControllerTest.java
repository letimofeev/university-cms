package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Teacher;
import com.foxminded.universitycms.service.TeacherService;
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
@WebMvcTest(TeacherController.class)
class TeacherControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TeacherService teacherService;

    @Test
    void showAllTeachers_shouldContainExpectedModel_whenGetRequest() throws Exception {
        List<Teacher> teachers = List.of(new Teacher(new ArrayList<>()));

        given(teacherService.findAll()).willReturn(teachers);

        mvc.perform(get("/show-all-teachers"))
                .andExpect(status().isOk())
                .andExpect(view().name("teachers"))
                .andExpect(model().attributeExists("teachers"))
                .andExpect(model().attribute("teachers", teachers));
    }
}
