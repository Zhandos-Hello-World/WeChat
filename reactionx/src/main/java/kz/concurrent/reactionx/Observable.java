package kz.concurrent.reactionx;

public class Observable<T> {
    private Task<T> task;
    private SuccessTask<T> successTask;
    private ErrorTask errorTask;
    private T data;

    private Observable() { }

    private Observable(Task task) {
        this.task = task;
    }

    public Observable start() {
        try {
            data = task.run();
            successTask.onSuccess(data);
        } catch (Throwable e) {
            errorTask.handleCallback(e);
        }
        return this;
    }

    public Observable onSuccess(SuccessTask<T> successTask) {
        this.successTask = successTask;
        return this;
    }

    public Observable onError(ErrorTask errorTask) {
        this.errorTask = errorTask;
        return this;
    }


    public static <T> Observable create(Task task) {
        return new Observable<T>(task);
    }
}
