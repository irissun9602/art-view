package skhu.artview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import skhu.artview.dto.User;
import skhu.artview.mapper.UserMapper;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired UserMapper UserMapper;

    @RequestMapping("list")
    public String list(Model model) {
        List<User> users = UserMapper.findAll();
        model.addAttribute("users", users);
        return "user/list";
    }

    @RequestMapping(value="create", method=RequestMethod.GET)
    public String create(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "user/edit";
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public String create(Model model, User user) {
        UserMapper.insert(user);
        return "redirect:list";
    }

    @RequestMapping(value="edit", method=RequestMethod.GET)
    public String edit(Model model, @RequestParam("id") int id) {
        User user = UserMapper.findOne(id);

        model.addAttribute("user", user);

        return "user/edit";
    }

    @RequestMapping(value="edit", method=RequestMethod.POST)
    public String edit(Model model, User user) {
        //UserMapper.update(User);
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(Model model, @RequestParam("id") int id) {
        UserMapper.delete(id);
        return "redirect:list";
    }
}
