package kz.concurrent.reactionx;

public interface ErrorTask {

    public void handleCallback(Throwable e);
}
