package entity.message;

public abstract class SentMessage extends Message {
    SentMessage(String content, Long senderId, Long channelId) {
        super(content, senderId, channelId);
    }

    abstract void reply(String content);

    abstract void remove();

    abstract void edit(String newContent);
}
