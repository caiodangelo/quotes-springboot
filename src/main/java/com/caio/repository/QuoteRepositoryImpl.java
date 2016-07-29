package com.caio.repository;

import com.caio.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextQuery;

import java.util.List;
import java.util.Random;

/**
 * Created by caio on 29/07/16.
 */
public class QuoteRepositoryImpl implements QuoteRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Quote findRandom() {
        Query query = new BasicQuery("{}");
        long total = mongoTemplate.count(query, Quote.class);
        int random = new Random().nextInt((int) total);
        List<Quote> quotes = mongoTemplate.findAll(Quote.class);

        return quotes.get(random);
    }
    }
