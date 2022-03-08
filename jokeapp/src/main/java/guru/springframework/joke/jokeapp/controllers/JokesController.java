package guru.springframework.joke.jokeapp.controllers;

import guru.springframework.joke.jokeapp.services.RandomQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final RandomQuoteService randomQuoteService;

    public JokesController(RandomQuoteService randomQuoteService){
        this.randomQuoteService = randomQuoteService;

    }
    @RequestMapping ({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", randomQuoteService.getJoke());
        return "chucknorris";
    }


}
