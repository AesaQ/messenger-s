package usecase.base;

public interface UseCase<T> {
    void execute(T param);
}
