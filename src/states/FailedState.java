// FailedState.java
package src.states;
public class FailedState implements PipelineState {

    @Override
    public void startBuild(Pipeline pipeline) {
        System.out.println("Cannot start build. Pipeline has failed.");
    }

    @Override
    public void runTests(Pipeline pipeline) {
        System.out.println("Cannot run tests. Pipeline has failed.");
    }

    @Override
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Cannot package. Pipeline has failed.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Cannot deploy. Pipeline has failed.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Cannot monitor. Pipeline has failed.");
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Cannot complete. Pipeline has failed.");
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Pipeline is already in failed state.");
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cancelling the pipeline from failed state.");
        pipeline.setState(new CancelledState());
    }

    @Override
    public String getStateName() {
        return "Failed";
    }
}
