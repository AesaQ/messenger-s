package usecase;

public class SendChatMessageUseCaseImpl extends SendChatMessageUseCase {
    public SendChatMessageUseCaseImpl(long senderId, long recipientId) {
        super(senderId, recipientId);
    }

    @Override
    public void execute() {

    }
}
