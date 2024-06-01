package usecase.remove;

import usecase.base.UseCase;

public abstract class RemoveGroupUseCase implements UseCase<Long> {
    public RemoveGroupUseCase(GroupRepository groupRepository) {
    }
}
