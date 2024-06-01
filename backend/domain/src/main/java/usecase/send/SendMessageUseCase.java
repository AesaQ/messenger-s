package usecase.send;

import usecase.base.DoubleParamUseCase;

public abstract class SendMessageUseCase implements DoubleParamUseCase<Long, Long> {
    String currentContent;

    public void setContent(String content) {
        currentContent = content;
    }
}
