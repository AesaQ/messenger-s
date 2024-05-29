package usecase;

import usecase.base.SendMessageUseCase;

public abstract class SendChatMessageUseCase extends SendMessageUseCase {
    protected long senderId;
    protected long recipientId;

    public SendChatMessageUseCase(long senderId, long recipientId) {
        this.senderId = senderId;
        this.recipientId = recipientId;
    }
}

