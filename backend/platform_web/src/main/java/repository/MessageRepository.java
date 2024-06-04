package repository;

import data.DomainMessageRepository;
import entity.DomainMessage;
import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Component
public class MessageRepository implements DomainMessageRepository {
    private final SpringMessageRepository springMessageRepository;

    @Autowired
    public MessageRepository(SpringMessageRepository springMessageRepository) {
        this.springMessageRepository = springMessageRepository;
    }

    @Override
    public void save(DomainMessage entity) {
        springMessageRepository.save((Message) entity);
    }

    @Override
    public Message findById(Long id) {
        Optional<Message> result = springMessageRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Message> findAll() {
        return null;
    }

    @Override
    public List<Message> findListByCommunicateId(Long id) {
        return springMessageRepository.findByCommunicateId(id);
    }

    @Override
    public void update(DomainMessage entity) {

    }

    @Override
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        springMessageRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}
