package ru.suai.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VectorTest {

    @Test
    public void testSum() {
        Vector v1  = new Vector(4);
        v1.set(0, 1);
        v1.set(1, 1);
        v1.set(2, 1);
        v1.set(3, 1);
        Vector v2  = new Vector(4);
        v2.set(0, 2);
        v2.set(1, 2);
        v2.set(2, 2);
        v2.set(3, 2);
        Vector v3 = v1.sum(v2);

        Vector correct = new Vector(4);
        correct.set(0, 3);
        correct.set(1, 3);
        correct.set(2, 3);
        correct.set(3, 3);
        assertEquals(v3.equals(correct), true);
    }

    @Test
    public void testSub() {
        Vector v1  = new Vector(4);
        v1.set(0, 1);
        v1.set(1, 1);
        v1.set(2, 1);
        v1.set(3, 1);
        Vector v2  = new Vector(4);
        v2.set(0, 2);
        v2.set(1, 2);
        v2.set(2, 2);
        v2.set(3, 2);
        Vector v3 = v1.sub(v2);

        Vector correct = new Vector(4);
        correct.set(0, -1);
        correct.set(1, -1);
        correct.set(2, -1);
        correct.set(3, -1);
        assertEquals(v3.equals(correct), true);
    }


}
