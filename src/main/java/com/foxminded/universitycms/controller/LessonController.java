package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Lesson;
import com.foxminded.universitycms.service.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LessonController {

    private final LessonService lessonService;


    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/show-all-lessons")
    public String showAllLessons(Model model) {
        List<Lesson> lessons = lessonService.findAll();
        model.addAttribute("lessons", lessons);
        return "lessons";
    }
}
