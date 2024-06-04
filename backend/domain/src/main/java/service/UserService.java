package service;

import data.DomainUserRepository;
import entity.communicate.DomainCommunicate;

import java.util.List;

public class UserService {
    private final DomainUserRepository userRepository;

    public UserService(DomainUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<? extends DomainCommunicate> getCommunicateListByUserId(Long id) {
        return userRepository.getCommunicateListByUserId(id);
    }
}
