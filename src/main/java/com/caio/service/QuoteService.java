package com.caio.service;

import com.caio.model.Quote;
import com.caio.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by caio on 11/06/16.
 */
@RestController
@RequestMapping("/quotes")
public class QuoteService {

    @Autowired
    QuoteRepository quoteRepository;

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<Quote> getQuote(@PathVariable String id) {
        return quoteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/random")
    public Quote getRandomQuote() {
        return quoteRepository.findRandom();
    }

    @PostMapping
    public Quote createQuote(@RequestBody Quote quote) {
        return quoteRepository.save(quote);
    }

    @DeleteMapping(value = "/{id}")
    public void removeQuote(@PathVariable String id) {
        quoteRepository.deleteById(id);
    }

    @DeleteMapping
    public void clearQuotes() {
        quoteRepository.deleteAll();
    }
}
