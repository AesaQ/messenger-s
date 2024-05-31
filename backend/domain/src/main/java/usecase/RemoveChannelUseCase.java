package usecase;

import data.ChannelRepository;
import usecase.base.UseCase;

public abstract class RemoveChannelUseCase implements UseCase<Long> {
    public RemoveChannelUseCase(
            ChannelRepository channelRepository
    ) {
    }
}
