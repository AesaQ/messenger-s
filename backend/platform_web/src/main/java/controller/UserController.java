package controller;

import entity.communicate.DomainCommunicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.ServiceProvider;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    private final UserService userService;

    public UserController(ServiceProvider serviceProvider) {
        this.userService = serviceProvider.getUserService();
    }

    @GetMapping("/get_communicates/user_id={id}")
    public List<? extends DomainCommunicate> getCommunicateListByUserId(@PathVariable Long id) {
        return userService.getCommunicateListByUserId(id);
    }

}
