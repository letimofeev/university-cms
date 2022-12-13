package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Subject;
import com.foxminded.universitycms.service.SubjectService;
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
@WebMvcTest(SubjectController.class)
class SubjectControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private SubjectService subjectService;

    @Test
    void showAllSubjects_shouldContainExpectedModel_whenGetRequest() throws Exception {
        List<Subject> subjects = List.of(new Subject(1, "a", "b"));

        given(subjectService.findAll()).willReturn(subjects);

        mvc.perform(get("/show-all-subjects"))
                .andExpect(status().isOk())
                .andExpect(view().name("subjects"))
                .andExpect(model().attributeExists("subjects"))
                .andExpect(model().attribute("subjects", subjects));
    }
}
