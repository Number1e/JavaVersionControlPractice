import org.junit.Test;
import static org.junit.Assert.*;

public class tes {
    private static final double PI = 3.14;
        @Test
        public void testHitungLuas() {
            double radius = 5.0;
            double expectedLuas = PI * radius * radius;
            double actualLuas = Lingkaran.hitungLuas(radius);
            assertEquals(expectedLuas, actualLuas, 0.001);
        }
    @Test(expected = IllegalArgumentException.class)
    public void testHitungLuasDenganRadiusnol() {
        double radius = 0;
        Lingkaran.hitungLuas(radius);
    }

        @Test(expected = IllegalArgumentException.class)
        public void testHitungLuasDenganRadiusNegatif() {
            double radius = -1.0;
            Lingkaran.hitungLuas(radius);
        }
    }

