package usecase.user;

import data.DomainUserRepository;
import usecase.base.UseCase;

public abstract class LoginUserUseCase implements UseCase<Long> {
    public LoginUserUseCase(
            DomainUserRepository userRepository
            //todo: Наверняка здесь понадобится какая нибудь сессия
    ) {
    }

    @Override
    public abstract void execute(Long userId);
}
