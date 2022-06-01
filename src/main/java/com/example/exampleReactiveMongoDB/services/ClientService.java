package com.example.exampleReactiveMongoDB.services;

import com.example.exampleReactiveMongoDB.documents.ClientDocument;
import com.example.exampleReactiveMongoDB.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Flux<ClientDocument> findAllClients() {
        return clientRepository.findAll();
    }

    public Mono<ClientDocument> findClient(String clientId) {
        return  clientRepository.findById(clientId);
    }

    public Mono<ClientDocument> createClient(ClientDocument client) {
        return clientRepository.save(client);
    }

    public Mono<ClientDocument> updateClient(String clientId, ClientDocument client) {
        var foundClient = clientRepository.findById(clientId).block();
        foundClient.setName(client.getName());
        foundClient.setLastName(client.getLastName());
        foundClient.setAge(client.getAge());
        foundClient.setPayment(client.getPayment());
        foundClient.setPhoto(client.getPhoto());
        return clientRepository.save(foundClient);
    }

    public boolean deleteClient(String clientId) {
        try {
            clientRepository.deleteById(clientId);
            return true;
        } catch (Exception e) {
            return  false;
        }
    }

    public String deleteAllClients() {
        clientRepository.deleteAll();
        return "The clients were removed";
    }

}
