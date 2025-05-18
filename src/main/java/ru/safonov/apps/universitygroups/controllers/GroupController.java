package ru.safonov.apps.universitygroups.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.safonov.apps.universitygroups.models.Group;
import ru.safonov.apps.universitygroups.services.GroupService;

@Controller
@RequestMapping("/groups")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping()
    public String index(Model model) {
        model
                .addAttribute("groups", groupService.findAll())
                .addAttribute("group", new Group());
        return "groups/index";
    }

    @PostMapping()
    public String create(@ModelAttribute("group") Group group, BindingResult bindingResult) {
        Group newGroup = groupService.save(group);
        return String.format("redirect:/groups/%d", newGroup.getId());
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") long id, Model model) {
        model.addAttribute("group", groupService.findOne(id));
        return "groups/show";
    }
}
