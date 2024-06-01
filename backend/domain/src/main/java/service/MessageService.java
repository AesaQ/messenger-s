package service;

import data.CommunicateRepository;
import data.MessageRepository;
import entity.enums.CommunicateType;
import entity.message.Message;
import usecase.send.SendMessageUseCase;

import java.util.List;

public class MessageService {
    private CommunicateRepository communicateRepository;
    private MessageRepository messageRepository;
    private SendMessageUseCase sendMessageUseCase;

    public MessageService(
            CommunicateRepository communicateRepository,
            MessageRepository messageRepository,
            SendMessageUseCase sendMessageUseCase
    ) {
        this.communicateRepository = communicateRepository;
        this.sendMessageUseCase = sendMessageUseCase;
        this.messageRepository = messageRepository;
    }

    void sendMessage(
            Long communicateId,
            CommunicateType type,
            Long senderId,
            String content
    ) {
        switch (type) {

            case CHAT:
                sendMessageUseCase.setContent(content);
                sendMessageUseCase.execute(senderId, communicateId);

            case GROUP:
                sendMessageUseCase.setContent(content);
                sendMessageUseCase.execute(senderId, communicateId);

            case CHANNEL:
                sendMessageUseCase.setContent(content);
                sendMessageUseCase.execute(senderId, communicateId);
        }
    }

    void removeMessage(Long messageId) {
        messageRepository.deleteById(messageId);
    }

    List<Message> getCommunicateMessages(Long communicateId) {
        return messageRepository.findAllByCommunicateId(communicateId);
    }
}
