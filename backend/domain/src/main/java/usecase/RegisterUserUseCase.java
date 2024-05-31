package usecase;

import data.UserRepository;
import entity.User;
import usecase.base.UseCase;

public abstract class RegisterUserUseCase implements UseCase<User> {
    public RegisterUserUseCase(
            UserRepository userRepository
    ) {
    }

    @Override
    public abstract void execute(User param);
}
