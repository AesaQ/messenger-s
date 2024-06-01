package usecase.user;

import data.UserRepository;
import usecase.base.UseCase;

public abstract class BlockUserUseCase implements UseCase<Long> {
    public BlockUserUseCase(
            Long senderId,
            UserRepository userRepository
    ) {
    }

    @Override
    public abstract void execute(Long param);
}
