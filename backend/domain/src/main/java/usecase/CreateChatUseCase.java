package usecase;

import data.ChatRepository;
import entity.chat.Chat;
import usecase.base.UseCase;

public abstract class CreateChatUseCase implements UseCase<Chat> {
    public CreateChatUseCase(ChatRepository chatRepository) {
    }

    @Override
    public abstract void execute(Chat newChat);
}
