package provider;

import org.springframework.stereotype.Component;
import repository.MessageRepository;
import repository.UserRepository;
import service.MessageService;
import service.UserService;
import usecase.RemoveMessageUseCaseImpl;
import usecase.SendMessageUseCaseImpl;

@Component
public class ServiceProvider {
    private final MessageService messageService;
    private final UserService userService;

    public ServiceProvider(
            MessageRepository messageRepository,
            SendMessageUseCaseImpl sendMessageUseCase,
            RemoveMessageUseCaseImpl removeMessageUseCase,

            UserRepository userRepository
    ) {
        this.messageService = new MessageService(messageRepository, sendMessageUseCase, removeMessageUseCase);
        this.userService = new UserService(userRepository);
    }

    public MessageService getMessageService() {
        return messageService;
    }

    public UserService getUserService() {
        return userService;
    }
}
