package mates;

import java.util.concurrent.ThreadLocalRandom;

public class Matematicas {

    public static double generarNumeroPiIterativo(long pasos) {
        long dentroCirculo = ThreadLocalRandom.current().longs(pasos)
                                     .parallel()
                                     .filter(i -> {
                                         double x = ThreadLocalRandom.current().nextDouble();
                                         double y = ThreadLocalRandom.current().nextDouble();
                                         return x * x + y * y <= 1;
                                     })
                                     .count();

        return (4.0 * dentroCirculo) / pasos;
    }
}
