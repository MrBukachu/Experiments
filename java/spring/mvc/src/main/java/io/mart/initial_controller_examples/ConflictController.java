package io.mart.initial_controller_examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Aleksandr Martiushov.
 */
@Controller
@RequestMapping("/parentMapping")
public class ConflictController {

    @RequestMapping("/register")
    public String displayTheForm() {
        return "HelloWorldPage";
    }
}
