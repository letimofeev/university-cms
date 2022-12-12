package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.*;
import com.foxminded.universitycms.service.LessonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.sql.Time;
import java.time.DayOfWeek;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(LessonController.class)
class LessonControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private LessonService lessonService;

    @Test
    void showAllLessons_shouldContainExpectedModel_whenGetRequest() throws Exception {
        Lesson lesson = new Lesson(1001, new Time(999), new Time(9999),
                new Group(), new Teacher(), DayOfWeek.MONDAY, new Classroom(), new Subject());
        List<Lesson> lessons = List.of(lesson);

        given(lessonService.findAll()).willReturn(lessons);

        mvc.perform(get("/show-all-lessons"))
                .andExpect(status().isOk())
                .andExpect(view().name("lessons"))
                .andExpect(model().attributeExists("lessons"))
                .andExpect(model().attribute("lessons", lessons));
    }
}
