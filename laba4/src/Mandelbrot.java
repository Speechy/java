import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {

    public static final int MAX_ITERATION = 2000;

    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.height = 3;
        range.width = 3;

    }

    @Override
    public int numIterations(double x, double y) {
        double real = 0;
        double imagin = 0;
        int iter = 0;
        while (iter < MAX_ITERATION && (real * real + imagin * imagin) < 4) {
            double real2 = real * real - imagin * imagin + x;
            double imagin2 = real * imagin * 2 + y;
            real = real2;
            imagin = imagin2;
            iter++;


        }
        if (iter == MAX_ITERATION) return -1;

        return iter;

    }
}
