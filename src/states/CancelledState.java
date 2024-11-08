package src.states;
// CancelledState.java
public class CancelledState implements PipelineState {

    @Override
    public void startBuild(Pipeline pipeline) {
        System.out.println("Cannot start build. Pipeline has been cancelled.");
    }

    @Override
    public void runTests(Pipeline pipeline) {
        System.out.println("Cannot run tests. Pipeline has been cancelled.");
    }

    @Override
    public void packageBuild(Pipeline pipeline) {
        System.out.println("Cannot package. Pipeline has been cancelled.");
    }

    @Override
    public void deploy(Pipeline pipeline) {
        System.out.println("Cannot deploy. Pipeline has been cancelled.");
    }

    @Override
    public void monitor(Pipeline pipeline) {
        System.out.println("Cannot monitor. Pipeline has been cancelled.");
    }

    @Override
    public void complete(Pipeline pipeline) {
        System.out.println("Cannot complete. Pipeline has been cancelled.");
    }

    @Override
    public void fail(Pipeline pipeline) {
        System.out.println("Cannot fail. Pipeline has been cancelled.");
    }

    @Override
    public void cancel(Pipeline pipeline) {
        System.out.println("Pipeline is already cancelled.");
    }

    @Override
    public String getStateName() {
        return "Cancelled";
    }
}
