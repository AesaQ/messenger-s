package entity.communicate;

import java.util.List;

public abstract class Group extends Chat {
    Group(Long id, List<Long> members) {
        super(id, members);
    }
}
