package pl.edu.wszib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.wszib.model.User;
import pl.edu.wszib.repository.UsersRepository;

@Controller
public class UserController {

    @Autowired
    UsersRepository usersRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String usersPage(Model model) {

        model.addAttribute("usersList", this.usersRepository.getUserList());
        model.addAttribute("user222", new User());

        return "users";
    }
}
