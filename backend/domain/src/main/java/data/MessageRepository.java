package data;

import ru.AesaQ.domain.data.base.Repository;
import ru.AesaQ.domain.entity.message.Message;

import java.util.Date;
import java.util.List;

public interface MessageRepository extends Repository<Message> {
    void create(Message message);

    Message getById(long id);

    List<Message> getAll();

    void update(Message message);

    void delete(long id);

    List<Message> search(String query);

    List<Message> getByUser(long userId);

    List<Message> getByChat(long chatId);

    List<Message> getByDate(Date date);

    List<Message> getUnreadMessages(long userId);
}
