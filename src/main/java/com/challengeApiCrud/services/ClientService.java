package com.challengeApiCrud.services;

import com.challengeApiCrud.dto.ClientDTO;
import com.challengeApiCrud.entities.Client;
import com.challengeApiCrud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = clientRepository.findById(id);
        Client entity = obj.get();
        return new ClientDTO(entity);
    }
}
