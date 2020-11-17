import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Resultados {

    private AtomicIntegerArray marcador = new AtomicIntegerArray(new int[]{0, 0, 0, 0, 0, 0});

    public void increment(int num) {
        marcador.incrementAndGet(num);
    }

    private int total() {
        int v = 0;
        for (int i = 0; i < 6; i++) {
            v += marcador.get(i);
        }
        return v;
    }

    @Override
    public String toString() {
        return String.format("Resultados:\n" +
                        "\t1: %d\n" +
                        "\t2: %d\n" +
                        "\t3: %d\n" +
                        "\t4: %d\n" +
                        "\t5: %d\n" +
                        "\t6: %d\n" +
                        "Total de la suma: %d\n",
                marcador.get(0), marcador.get(1),
                marcador.get(2), marcador.get(3),
                marcador.get(4), marcador.get(5), total());
    }

}
