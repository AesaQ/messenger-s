package usecase.remove;

import data.MessageRepository;
import entity.message.SentMessage;
import usecase.base.UseCase;

public abstract class RemoveMessageUseCase implements UseCase<SentMessage> {
    public RemoveMessageUseCase(
            MessageRepository messageRepository
    ) {
    }

    @Override
    public abstract void execute(SentMessage param);
}
