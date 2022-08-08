package com.example.manytomany.controller;

import com.example.manytomany.model.Role;
import com.example.manytomany.model.User;
import com.example.manytomany.repository.RoleRepository;
import com.example.manytomany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    @GetMapping("/users")
    public String showUserList(Model model){
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

    @GetMapping("/users/new")
    public String showCreateNewUserForm(Model model){
        List<Role> listRoles = roleRepo.findAll();
        model.addAttribute("listRoles", listRoles);
        model.addAttribute("users", new User());
        return "user_form.html";
    }

    @PostMapping("/users/save")
    public String saveUser(Model model, @ModelAttribute User user){
        user = userRepo.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String showEditUserForm(@PathVariable("id") Long id, Model model){
        User user = userRepo.findById(id).get();
        model.addAttribute("users", user);

        List<Role> listRoles = roleRepo.findAll();
        model.addAttribute("listRoles", listRoles);

        return  "user_form.html";
    }
}
