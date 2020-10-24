package com.przemyslawwolosz.fragments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentsController {

    @GetMapping("/fragments")
    public String getFragmentsExample() {
        return "fragments/index.html";
    }
}
