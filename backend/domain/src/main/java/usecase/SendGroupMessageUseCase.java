package usecase;

import usecase.base.SendMessageUseCase;

public abstract class SendGroupMessageUseCase extends SendMessageUseCase {
    protected long senderId;
    protected long groupId;

    public SendGroupMessageUseCase(long senderId, long groupId) {
        this.senderId = senderId;
        this.groupId = groupId;
    }

}
