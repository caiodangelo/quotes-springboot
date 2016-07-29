package com.caio.service;

import com.caio.model.Quote;
import com.caio.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Random;

/**
 * Created by caio on 11/06/16.
 */
@RestController
@RequestMapping("/quotes")
public class QuoteService {

    @Autowired
    QuoteRepository quoteRepository;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Quote> getAllQuotes(){
        return quoteRepository.findAll();
    }

    @RequestMapping(value="/random", method = RequestMethod.GET)
    public Quote getRandomQuote(){
        return quoteRepository.findRandom();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Quote createQuote(@RequestBody Quote quote){
        return quoteRepository.save(quote);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeQuote(@PathVariable String id){
        quoteRepository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void clearQuotes(){
        quoteRepository.deleteAll();
    }
}
