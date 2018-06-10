package Selections;

public class Options {
    protected int val[];
    boolean chosen;

    public Options(int arr[]) {
        val = arr;
        chosen = false;
        //sendToGivenAlgorithm(arr);
    }

    public void sendToGivenAlgorithm(int arr[]) {}

    public boolean isChosen(){
        return chosen;
    }
}
