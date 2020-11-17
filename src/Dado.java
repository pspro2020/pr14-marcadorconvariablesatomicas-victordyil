import java.util.Random;

public class Dado implements Runnable{
    Resultados resultados;
    Random random = new Random();
    public Dado(Resultados resultados) {
        this.resultados = resultados;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            resultados.increment(random.nextInt(6));
        }
    }
}
