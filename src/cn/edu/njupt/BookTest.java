package cn.edu.njupt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book1;
    private Book book2;
    @BeforeEach
    void setUp() throws Exception {
        book1 = new Book("ES", 12.99);
        book2 = new Book("The Gate", 11.99);
    }

    @AfterEach
    void tearDown()throws Exception {
        book1 = null;
        book2 = null;
    }
    @Test
    void testEqualsObject(){
        assertFalse(book2.equals(book1));
        assertTrue(book1.equals(book1));
    }
}