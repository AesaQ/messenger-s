package usecase;

import data.UserRepository;
import usecase.base.UseCase;

public abstract class LoginUserUseCase implements UseCase<Long> {
    public LoginUserUseCase(
            UserRepository userRepository
            //todo: Наверняка здесь понадобится какая нибудь сессия
    ) {
    }

    @Override
    public abstract void execute(Long userId);
}
