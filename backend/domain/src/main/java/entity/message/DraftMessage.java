package entity.message;

public abstract class DraftMessage extends Message {
    DraftMessage(String content, Long senderId, Long channelId) {
        super(content, senderId, channelId);
    }

    abstract void send();
}
