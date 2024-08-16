package com.BrinkerInc.BrinkerIncOrderService.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.stereotype.Service;
import com.BrinkerInc.BrinkerIncOrderService.entity.Sequence;



@Service
public class OrderSequence {
	
	  @Autowired
	    private MongoOperations mongoOperations;

	    public Integer generateNextOrderId(){
	        Sequence counter = mongoOperations.findAndModify(
	                query(where("_id").is("sequence")),
	                new Update().inc("sequence", 1),
	                options().returnNew(true).upsert(true),
	                Sequence.class);
	        return counter.getSequence();

	    }
}
