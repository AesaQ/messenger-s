package usecase;

import data.DomainMessageRepository;
import org.springframework.stereotype.Component;
import usecase.message.RemoveMessageUseCase;

@Component
public class RemoveMessageUseCaseImpl extends RemoveMessageUseCase {
    public RemoveMessageUseCaseImpl(DomainMessageRepository messageRepository) {
        super(messageRepository);
    }
}
