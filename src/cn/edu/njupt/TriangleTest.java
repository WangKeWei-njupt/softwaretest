package cn.edu.njupt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle t1;
    private Triangle t2;
    @BeforeEach
    void setUp() {
        t1 = new Triangle(3,4,5);
        t2 = new Triangle(6,8,10);
    }

    @AfterEach
    void tearDown() {
        t1=null;
        t2=null;
    }
    @Test
    void testEqualsObject(){
        assertFalse(t2.equals(t1));
        assertTrue(t1.equals(t1));
    }
}