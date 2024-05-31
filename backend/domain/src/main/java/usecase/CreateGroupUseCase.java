package usecase;

import data.GroupRepository;
import entity.chat.Group;
import usecase.base.UseCase;

public abstract class CreateGroupUseCase implements UseCase<Group> {
    public CreateGroupUseCase(GroupRepository groupRepository) {
    }

    @Override
    public abstract void execute(Group newGroup);
}
