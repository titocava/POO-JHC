
import org.junit.Test;

import java.util.Optional;
import static org.junit.Assert.*;



public class repuestosTest {

    @Test

    public void agregarUnNuevoRepuesto() {
        Repuesto unRep = new Repuesto(1, "bocina", "terrible bocina");

        assertEquals((Integer) 1, unRep.getId()) ;
        assertEquals("bocina", unRep.getNombre()) ;
        assertEquals("terrible bocina", unRep.geDescripcion()) ;
    }

    @Test
    public void quitarUnRepuesto() {

    }
}
