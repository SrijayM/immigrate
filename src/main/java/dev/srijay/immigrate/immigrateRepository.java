package dev.srijay.immigrate;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface immigrateRepository extends MongoRepository<immigrate, ObjectId> {
}
