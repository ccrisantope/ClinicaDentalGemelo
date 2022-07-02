
package medicasoft.Capa3_Dominio;

import org.junit.Test;
import static org.junit.Assert.*;


public class DentistaTest {
    
    public DentistaTest() {
    }
     @Test
    public void testTienecodigoValido1() {
        System.out.println("tienecodigoValido1");
        Dentista instance = new Dentista();
        instance.setCodigo("1234");
        boolean resultadoesperado = true;
        boolean resultadoobtenido = instance.tienecodigoValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
    @Test
    public void testTienecodigoValido2() {
        System.out.println("tienecodigoValido2");
        Dentista instance = new Dentista();
        instance.setCodigo("124");
        boolean resultadoesperado = false;
        boolean resultadoobtenido = instance.tienecodigoValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
    @Test
    public void testTienecodigoValido3() {
        System.out.println("tienecodigoValido3");
        Dentista instance = new Dentista();
        instance.setCodigo("4321");
        boolean resultadoesperado = true;
        boolean resultadoobtenido = instance.tienecodigoValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
     @Test
    public void testTienecodigoValido4() {
        System.out.println("tienecodigoValido4");
        Dentista instance = new Dentista();
        instance.setCodigo("4321");
        boolean resultadoesperado = true;
        boolean resultadoobtenido = instance.tienecodigoValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
}
