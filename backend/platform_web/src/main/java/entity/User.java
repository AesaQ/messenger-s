package entity;

import converter.LongListConverter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User extends DomainUser {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "description")
    private String description;
    @Column(name = "last_online_time")
    private Long lastOnlineTime;

    @Column(name = "password")
    private String password;
    @Convert(converter = LongListConverter.class)
    @Column(name = "communicateIDs")
    private List<Long> communicateIDs;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(Long lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
