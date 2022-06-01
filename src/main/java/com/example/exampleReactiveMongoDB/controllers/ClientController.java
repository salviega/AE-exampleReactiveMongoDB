package com.example.exampleReactiveMongoDB.controllers;

import com.example.exampleReactiveMongoDB.documents.ClientDocument;
import com.example.exampleReactiveMongoDB.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Flux<ClientDocument>> findAllClients() {
        return new ResponseEntity<>(clientService.findAllClients(), HttpStatus.OK);
    };

    @GetMapping("/{id}")
    public ResponseEntity<Mono<ClientDocument>> findClient(@PathVariable(name = "id") String clientId) {
        return new ResponseEntity<>(clientService.findClient(clientId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Mono<ClientDocument>> createClient(@RequestBody ClientDocument client) {
        return new ResponseEntity(clientService.createClient(client), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mono<ClientDocument>> updateClient(@PathVariable(name = "id") String clientId, @RequestBody ClientDocument client) {
        return new ResponseEntity<>(clientService.updateClient(clientId, client), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable(name = "id") String clientId) {
        var okay = clientService.deleteClient(clientId);
        if (okay == true) return "The client was removed";
        else return  "The client wasn't found";
    }

    @DeleteMapping()
    public String deleteAllClients() {
        return clientService.deleteAllClients();
    }
}
