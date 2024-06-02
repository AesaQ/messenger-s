package entity;

public abstract class DomainMessage {
    private Long id;
    private String author;
    private String content;
    private Long time;
    private Long communicateId;

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
