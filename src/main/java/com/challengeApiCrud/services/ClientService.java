package com.challengeApiCrud.services;

import com.challengeApiCrud.entities.Client;
import com.challengeApiCrud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    List<Client> findById() {
        
    }
}
