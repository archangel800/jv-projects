package guru.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteServiceImpl implements RandomQuoteService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomQuoteServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes){

        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
