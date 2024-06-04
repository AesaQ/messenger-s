package usecase.user;


import data.DomainUserRepository;
import entity.DomainUser;
import usecase.base.UseCase;

public abstract class RegisterUserUseCase implements UseCase<DomainUser> {
    public RegisterUserUseCase(
            DomainUserRepository userRepository
    ) {
    }

    @Override
    public abstract void execute(DomainUser param);
}
