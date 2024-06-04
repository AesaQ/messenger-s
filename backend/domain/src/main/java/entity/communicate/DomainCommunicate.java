package entity.communicate;

import java.util.List;

public abstract class DomainCommunicate {
    private Long id;
    private String name;
    private String creater;
    private List<Long> membersId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public List<Long> getMembersId() {
        return membersId;
    }

    public void setMembersId(List<Long> membersId) {
        this.membersId = membersId;
    }
}
