package entity.chat;

import java.util.List;

public abstract class GroupChat extends Chat {
    GroupChat(Long id, List<Long> members) {
        super(id, members);
    }
}
