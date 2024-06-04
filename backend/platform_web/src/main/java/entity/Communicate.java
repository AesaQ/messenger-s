package entity;

import converter.StringListConverter;
import entity.communicate.DomainCommunicate;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "communicate")
public class Communicate extends DomainCommunicate {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "creater")
    private String creater;
    @Convert(converter = StringListConverter.class)
    @Column(name = "members")
    private List<String> members;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCreater() {
        return creater;
    }

    @Override
    public void setCreater(String creater) {
        this.creater = creater;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
