package usecase;

import usecase.base.SendMessageUseCase;

public abstract class SendChannelMessageUseCase extends SendMessageUseCase {
    long senderId;
    long channelId;

    public SendChannelMessageUseCase(long senderId, long channelId) {
        this.senderId = senderId;
        this.channelId = channelId;
    }
}
