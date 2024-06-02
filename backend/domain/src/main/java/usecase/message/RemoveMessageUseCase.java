package usecase.message;

import data.DomainMessageRepository;
import entity.DomainMessage;
import usecase.base.UseCase;

public abstract class RemoveMessageUseCase implements UseCase<DomainMessage> {
    private DomainMessageRepository messageRepository;

    public RemoveMessageUseCase(
            DomainMessageRepository messageRepository
    ) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void execute(DomainMessage message) {
        messageRepository.deleteById(message.getId());
    }
}
