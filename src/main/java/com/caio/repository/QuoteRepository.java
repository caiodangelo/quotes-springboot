package com.caio.repository;

import com.caio.model.Quote;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by caio on 11/06/16.
 */
public interface QuoteRepository extends MongoRepository<Quote,String>, QuoteRepositoryCustom {

    Quote findRandom();
}
