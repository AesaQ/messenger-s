package usecase;

import data.ChannelRepository;
import entity.Channel;
import usecase.base.UseCase;

public abstract class CreateChannelUseCase implements UseCase<Channel> {
    public CreateChannelUseCase(ChannelRepository channelRepository) {
    }

    @Override
    public abstract void execute(Channel newChannel);
}
