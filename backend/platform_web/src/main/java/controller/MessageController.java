package controller;

import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import provider.ServiceProvider;
import repository.MessageRepository;
import service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private final MessageRepository messageRepository;
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageRepository messageRepository, ServiceProvider serviceProvider) {
        this.messageRepository = messageRepository;
        this.messageService = serviceProvider.getMessageService();
    }

    @PostMapping
    public void sendMessage(@RequestBody Message message) {
        messageService.sendMessage(message);
    }

    @GetMapping("/get/{id}")
    public Message findById(@PathVariable Long id) {
        return (Message) messageService.findById(id);
    }

    @GetMapping("/getListByCommunicateId/{communicateId}")
    public List<Message> findListByCommunicateId(@PathVariable Long communicateId) {
        return messageRepository.findListByCommunicateId(communicateId);
    }
}
