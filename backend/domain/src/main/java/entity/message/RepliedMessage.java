package entity.message;

public abstract class RepliedMessage extends SentMessage {
    RepliedMessage(String content, Long senderId, Long channelId, Long replyTo) {
        super(content, senderId, channelId);
    }

}
