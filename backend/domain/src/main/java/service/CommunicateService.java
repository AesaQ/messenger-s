package service;

import data.DomainCommunicateRepository;


public class CommunicateService {
    private final DomainCommunicateRepository communicateRepository;

    public CommunicateService(
            DomainCommunicateRepository communicateRepository
    ) {
        this.communicateRepository = communicateRepository;
    }

}
