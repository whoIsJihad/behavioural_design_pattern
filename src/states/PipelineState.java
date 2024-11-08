// PipelineState.java
package src.states;

public interface PipelineState {
    void startBuild(Pipeline pipeline);
    void runTests(Pipeline pipeline);
    void packageBuild(Pipeline pipeline);
    void deploy(Pipeline pipeline);
    void monitor(Pipeline pipeline);
    void complete(Pipeline pipeline);
    void fail(Pipeline pipeline);
    void cancel(Pipeline pipeline);
    String getStateName();
}
