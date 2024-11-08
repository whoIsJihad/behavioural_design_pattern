package src.states;

// DeployingState.java
public class DeployingState implements PipelineState {

    @Override
    public void startBuild(Pipeline pipeline) {
        System.out.println("Cannot start build. Deployment is in progress.");
    }

    @Override
    public void runTests(Pipeline pipeline) {
        System.out.println("Cannot run tests. Deployment is in progress.");
    }

    @Override
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Cannot package. Deployment is in progress.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Deployment is already in progress.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Deployment completed. Starting monitoring...");
        pipeline.setState(new MonitoringState());
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Cannot complete. Deployment is still in progress.");
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Deployment failed.");
        pipeline.setState(new FailedState());
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cancelling the pipeline during deployment.");
        pipeline.setState(new CancelledState());
    }

    @Override
    public String getStateName() {
        return "Deploying";
    }
}
