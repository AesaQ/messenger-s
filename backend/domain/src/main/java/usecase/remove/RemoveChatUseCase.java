package usecase.remove;

import usecase.base.UseCase;

public abstract class RemoveChatUseCase implements UseCase<Long> {
    public RemoveChatUseCase(ChatRepository chatRepository) {
    }
}
