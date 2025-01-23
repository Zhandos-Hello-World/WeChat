package kz.concurrent.reactionx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cancellable {
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();


    public void execute(Observable observable) {
        executorService.submit(() -> {
            observable.start();
        });
    }

    public void clear() {
        executorService.shutdownNow();
    }


}
