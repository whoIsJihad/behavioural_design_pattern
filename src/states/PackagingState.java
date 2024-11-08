package src.states;

// PackagingState.java
public class PackagingState implements PipelineState {

    @Override
    public void startBuild(Pipeline pipeline) {
        System.out.println("Cannot start build. Packaging is in progress.");
    }

    @Override
    public void runTests(Pipeline pipeline) {
        System.out.println("Cannot run tests. Packaging is in progress.");
    }

    @Override
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Build is already being packaged.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Packaging completed. Deploying the application...");
        pipeline.setState(new DeployingState());
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Cannot monitor. Pipeline has not been deployed yet.");
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Cannot complete. Packaging is still in progress.");
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Packaging failed.");
        pipeline.setState(new FailedState());
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cancelling the pipeline during packaging.");
        pipeline.setState(new CancelledState());
    }

    @Override
    public String getStateName() {
        return "Packaging";
    }
}
