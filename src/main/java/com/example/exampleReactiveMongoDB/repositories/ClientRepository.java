package com.example.exampleReactiveMongoDB.repositories;

import com.example.exampleReactiveMongoDB.documents.ClientDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<ClientDocument, String> {
}
