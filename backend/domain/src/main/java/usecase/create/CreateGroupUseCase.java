package usecase.create;

import entity.communicate.Group;
import usecase.base.UseCase;

public abstract class CreateGroupUseCase implements UseCase<Group> {
    public CreateGroupUseCase(GroupRepository groupRepository) {
    }

    @Override
    public abstract void execute(Group newGroup);
}
