package src.states;

// CompletedState.java
public class CompletedState implements PipelineState {

    @Override
    public void startBuild(Pipeline pipeline) {
        System.out.println("Cannot start build. Pipeline has already completed.");
    }

    @Override
    public void runTests(Pipeline pipeline) {
        System.out.println("Cannot run tests. Pipeline has already completed.");
    }

    @Override
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Cannot package. Pipeline has already completed.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Cannot deploy. Pipeline has already completed.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Cannot monitor. Pipeline has already completed.");
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Pipeline is already completed.");
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Cannot fail. Pipeline has already completed.");
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cannot cancel. Pipeline has already completed.");
    }

    @Override
    public String getStateName() {
        return "Completed";
    }
}
