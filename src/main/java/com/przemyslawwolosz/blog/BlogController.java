package com.przemyslawwolosz.blog;

import com.przemyslawwolosz.blog.menu.MenuDto;
import com.przemyslawwolosz.blog.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private MenuService menuService;

    @GetMapping({"/blog"})
    public String getBlog(Model model) {
        List<MenuDto> menuItems = menuService.getMenu();
        model.addAttribute("menuItems", menuItems);
        return "blog/index.html";
    }
}