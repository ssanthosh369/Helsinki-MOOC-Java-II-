public class TripleTacoBox implements TacoBox{
    private int tacos;

    public TripleTacoBox() {
        tacos = 3;
    }

    public void eat() {
        if(tacos > 0)
            tacos--;
    }

    public int tacosRemaining() {
        return tacos;
    }
}
