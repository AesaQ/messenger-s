package provider;

import org.springframework.stereotype.Component;
import repository.MessageRepository;
import service.MessageService;
import usecase.RemoveMessageUseCaseImpl;
import usecase.SendMessageUseCaseImpl;

@Component
public class ServiceProvider {
    private MessageService messageService;

    public ServiceProvider(MessageRepository messageRepository, SendMessageUseCaseImpl sendMessageUseCase, RemoveMessageUseCaseImpl removeMessageUseCase) {
        this.messageService = new MessageService(messageRepository, sendMessageUseCase, removeMessageUseCase);
    }

    public MessageService getMessageService() {
        return messageService;
    }
}
