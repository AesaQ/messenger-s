package data;

import ru.AesaQ.domain.data.base.Repository;
import ru.AesaQ.domain.entity.Channel;

import java.util.List;

public interface ChannelRepository extends Repository<Channel> {
    void create(Channel Channel);

    Channel getById(long id);

    List<Channel> getAll();

    void update(Channel channel);

    void delete(long id);

    List<Channel> search(String query);

    List<Channel> getByAuthor(long userId);
}
