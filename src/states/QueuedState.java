package src.states;

public class QueuedState implements PipelineState{
    @Override
    public void startBuild(Pipeline pipeline) {
        System.out.println("Starting build.");
        pipeline.setState(new BuildingState());
    }

    @Override
    public void runTests(Pipeline pipeline) {
        System.out.println("Cannot run tests, pipeline is queued.");
    }

    @Override
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Cannot package build, pipeline is queued.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Cannot deploy, pipeline is queued.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Cannot monitor, pipeline is queued.");
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Cannot complete, pipeline is queued.");
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Failing pipeline.");
        pipeline.setState(new FailedState());
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cancelling pipeline.");
        pipeline.setState(new CancelledState());
    }

    @Override
    public String getStateName() {
        return "Queued";
    }
	
}
