package kz.concurrent.reactionx;

public interface SuccessTask<T> {
    public void onSuccess(T data);
}
