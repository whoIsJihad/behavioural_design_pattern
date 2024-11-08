package src.states;

public class BuildingState implements PipelineState{
    @Override 
    public void startBuild(Pipeline pipeline){
        System.out.println("Build is already in progress.");
    }
    @Override
    public void runTests(Pipeline pipeline){
        System.out.println("Build complete.running tests");
        pipeline.setState(new TestingState());
    }
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Cannot package. Tests have not run yet.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Cannot deploy. Tests have not run yet.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Cannot monitor. Pipeline has not been deployed yet.");
    }
    @Override
    public void complete(Pipeline pipeline){
        System.out.println("Cannot complete.Build is still in progress");
    }
    @Override
    public void fail(Pipeline pipeline){
        System.out.println("Build failed");
        pipeline.setState(new FailedState());
    }
    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cancelling the pipeline during build.");
        pipeline.setState(new CancelledState());
    }

    @Override
    public String getStateName() {
        return "Building";
    }
}
