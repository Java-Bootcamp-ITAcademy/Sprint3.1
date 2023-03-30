package n1exercici1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UndoTest {
    Undo undo1=Undo.getInstance();
    Undo undo2=Undo.getInstance();
    Undo undo3=undo2;

    /* Testing that we are creating the same object */
    @Test
    void testUndo1AndUndo2() {
        assertEquals(undo1,undo2);
    }

    @Test
    void testUndo1AndUndo3() {
        assertEquals(undo1,undo3);
    }

    @Test
    void testUndo2AndUndo3() {
        assertEquals(undo2,undo3);
    }
}
