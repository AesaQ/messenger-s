package usecase.message;

import data.DomainMessageRepository;
import usecase.base.UseCase;

public abstract class RemoveMessageUseCase implements UseCase<Long> {
    private DomainMessageRepository messageRepository;

    public RemoveMessageUseCase(
            DomainMessageRepository messageRepository
    ) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void execute(Long id) {
        messageRepository.deleteById(id);
    }
}
