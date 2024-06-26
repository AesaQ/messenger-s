package service;

import data.DomainMessageRepository;
import entity.DomainMessage;
import usecase.message.RemoveMessageUseCase;
import usecase.message.SendMessageUseCase;

import java.util.List;

public class MessageService {
    private final DomainMessageRepository messageRepository;
    private final SendMessageUseCase sendMessageUseCase;
    private final RemoveMessageUseCase removeMessageUseCase;

    public MessageService(
            DomainMessageRepository messageRepository,
            SendMessageUseCase sendMessageUseCase,
            RemoveMessageUseCase removeMessageUseCase
    ) {
        this.sendMessageUseCase = sendMessageUseCase;
        this.messageRepository = messageRepository;
        this.removeMessageUseCase = removeMessageUseCase;
    }

    public void sendMessage(DomainMessage message) {
        sendMessageUseCase.execute(message);
    }

    public void removeById(Long id) {
        removeMessageUseCase.execute(id);
    }

    public List<? extends DomainMessage> findListByCommunicateId(Long communicateId) {
        return messageRepository.findListByCommunicateId(communicateId);
    }

    public DomainMessage findById(Long id) {
        return messageRepository.findById(id);
    }
}
