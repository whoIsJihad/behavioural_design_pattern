package src.states;

public class Main {
    public static void main(String[] args) {
        Pipeline pipeline=new Pipeline("PipeX12345", "AwesomeProject");
        pipeline.displayState();
        pipeline.startBuild();
        pipeline.displayState();
        pipeline.runTests();
        pipeline.displayState();
        pipeline.packageBuild();
        pipeline.displayState();
    }
}
