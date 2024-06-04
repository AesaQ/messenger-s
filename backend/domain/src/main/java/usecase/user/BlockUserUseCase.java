package usecase.user;

import data.DomainUserRepository;
import usecase.base.UseCase;

public abstract class BlockUserUseCase implements UseCase<Long> {
    public BlockUserUseCase(
            Long senderId,
            DomainUserRepository userRepository
    ) {
    }

    @Override
    public abstract void execute(Long param);
}
