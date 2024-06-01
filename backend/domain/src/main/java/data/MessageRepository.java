package data;


import data.base.Repository;
import entity.message.Message;

import java.util.List;

public interface MessageRepository extends Repository<Message> {
    @Override
    void save(Message entity);

    @Override
    Message findById(Long id);

    @Override
    List<Message> findAll();

    List<Message> findAllByCommunicateId(Long communicateId);

    @Override
    void update(Message entity);

    @Override
    void deleteById(Long id);

    @Override
    boolean existsById(Long id);
}
