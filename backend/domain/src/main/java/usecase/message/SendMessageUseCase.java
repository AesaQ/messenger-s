package usecase.message;

import entity.DomainMessage;
import usecase.base.UseCase;

public abstract class SendMessageUseCase implements UseCase<DomainMessage> {
    String currentContent;

    public void setContent(String content) {
        currentContent = content;
    }
}
