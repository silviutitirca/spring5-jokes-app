package silviutitirca.spring5jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import silviutitirca.spring5jokesapp.services.JokeService;

/**
 * @author Silviu_Titirca on 11/25/2021
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return  "index";
    }
}
