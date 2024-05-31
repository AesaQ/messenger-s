package usecase.base;

public abstract class SendMessageUseCase implements NonParamUseCase {
    String currentContent;

    public void setContent(String content) {
        currentContent = content;
    }
}
