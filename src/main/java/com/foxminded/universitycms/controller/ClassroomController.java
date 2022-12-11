package com.foxminded.universitycms.controller;

import com.foxminded.universitycms.model.Classroom;
import com.foxminded.universitycms.service.ClassroomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClassroomController {

    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping("/show-all-classrooms")
    public String showAllClassrooms(Model model) {
        List<Classroom> classrooms = classroomService.findAll();
        model.addAttribute("allClassrooms", classrooms);
        return "all-classrooms";
    }
}
