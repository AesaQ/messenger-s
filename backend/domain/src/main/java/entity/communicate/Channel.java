package entity.communicate;

import java.util.List;

public abstract class Channel implements Communicate {
    public Channel(Long id, String title, Long admin, List<Long> members) {
    }
}
