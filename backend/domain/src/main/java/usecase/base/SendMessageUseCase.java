package usecase.base;

public abstract class SendMessageUseCase implements UseCase {
    String currentContent;

    public void setContent(String content) {
        currentContent = content;
    }
}
