package controller;

import entity.DomainMessage;
import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import provider.ServiceProvider;
import service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(ServiceProvider serviceProvider) {
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
    public List<? extends DomainMessage> findListByCommunicateId(@PathVariable Long communicateId) {
        return messageService.findListByCommunicateId(communicateId);
    }

    @DeleteMapping("/remove/{id}")
    public void removeById(@PathVariable Long id) {
        messageService.removeById(id);
    }
}
