package src.states;

public class Pipeline {
    private PipelineState currentPipelineState;
    private String pipelineId;
    private String projectName;

    Pipeline(String pipelineId,String projectName){
        this.pipelineId=pipelineId;
        this.projectName=projectName;
        currentPipelineState=new QueuedState();
        System.out.println("pipeline started with id : "+pipelineId+" and project name :"+projectName);
    }
    public void setState(PipelineState state){
        this.currentPipelineState=state;
    }

    public void startBuild(){
        currentPipelineState.startBuild(this);
    }
    public void runTests() {
        currentPipelineState.runTests(this);
    }

    public void packageBuild() {
        currentPipelineState.packageBuild(this);
    }

    public void deploy() {
        currentPipelineState.deploy(this);
    }

    public void monitor() {
        currentPipelineState.monitor(this);
    }

    public void complete() {
        currentPipelineState.complete(this);
    }
    public void cancel() {
        currentPipelineState.cancel(this);
    }
    public void displayState(){
        System.out.println("Pipeline id : "+pipelineId);
        System.out.println("Project Name : "+projectName);
        System.out.println("Current State : "+currentPipelineState.getStateName());
    }
}
