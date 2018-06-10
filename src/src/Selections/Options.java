package Selections;

public abstract class Options {
    protected int val[];
    boolean chosen;

    public Options(int arr[]) {
        val = arr;
        chosen = false;
    }

    public abstract void sendToGivenAlgorithm(int arr[]);

    public boolean isChosen;
}
