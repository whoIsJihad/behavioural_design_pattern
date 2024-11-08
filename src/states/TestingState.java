package src.states;

public class TestingState implements PipelineState {
    public void startBuild(Pipeline pipeline){
        System.out.println("Cannot start build.Tests are running");
    }
    public void runTests(Pipeline pipeline){
        System.out.println("Tests are running");
    }
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Tests passed. Packaging the build...");
        pipeline.setState(new PackagingState());
    }
    public void deploy(Pipeline pipeline) {
        System.out.println("Cannot deploy. Build needs to be packaged first.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Cannot monitor. Pipeline has not been deployed yet.");
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Cannot complete. Tests are still running.");
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Tests failed.");
        pipeline.setState(new FailedState());
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Cancelling the pipeline during testing.");
        pipeline.setState(new CancelledState());
    }
    public String getStateName(){
        return "Testing";
    }
}
