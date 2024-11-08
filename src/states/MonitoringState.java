package src.states;

// MonitoringState.java
public class MonitoringState implements PipelineState {

    @Override
    public void startBuild(Pipeline pipeline) {
        System.out.println("Cannot start build. Monitoring is in progress.");
    }

    @Override
    public void runTests(Pipeline pipeline) {
        System.out.println("Cannot run tests. Monitoring is in progress.");
    }

    @Override
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Cannot package. Monitoring is in progress.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Cannot deploy. Monitoring is in progress.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Monitoring is already in progress.");
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Monitoring completed. Pipeline is successful.");
        pipeline.setState(new CompletedState());
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Issues detected during monitoring.");
        pipeline.setState(new FailedState());
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cancelling the pipeline during monitoring.");
        pipeline.setState(new CancelledState());
    }

    @Override
    public String getStateName() {
        return "Monitoring";
    }
}
