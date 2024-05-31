package usecase;

import data.GroupRepository;
import usecase.base.UseCase;

public abstract class RemoveGroupUseCase implements UseCase<Long> {
    public RemoveGroupUseCase(GroupRepository groupRepository) {
    }
}
