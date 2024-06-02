package entity;


import jakarta.persistence.*;

@Entity
@Table(name = "message")
public class Message extends DomainMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "author")
    private String author;
    @Column(name = "content")
    private String content;
    @Column(name = "time")
    private Long time;
    @Column(name = "communicateId")
    private Long communicateId;

    public Message() {
        super();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getCommunicateId() {
        return communicateId;
    }

    public void setCommunicateId(Long communicateId) {
        this.communicateId = communicateId;
    }
}
