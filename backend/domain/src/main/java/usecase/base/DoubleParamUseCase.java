package usecase.base;

public interface DoubleParamUseCase<T1, T2> {
    void execute(T1 param1, T2 param2);
}
