package usecase;

import entity.DomainMessage;
import org.springframework.stereotype.Component;
import repository.MessageRepository;
import usecase.message.SendMessageUseCase;

@Component
public class SendMessageUseCaseImpl extends SendMessageUseCase {
    private final MessageRepository messageRepository;

    public SendMessageUseCaseImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void execute(DomainMessage message) {
        messageRepository.save(message);
    }
}
