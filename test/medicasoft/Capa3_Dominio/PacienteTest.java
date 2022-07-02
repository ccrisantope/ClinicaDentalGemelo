
package medicasoft.Capa3_Dominio;

import org.junit.Test;
import static org.junit.Assert.*;


public class PacienteTest {
    
    public PacienteTest() {
    }

    
    @Test
    public void testTieneDNIValido1() {
        System.out.println("tieneDNIValido1");
        Paciente instance = new Paciente();
        instance.setDNI("12345678");
        boolean resultadoesperado = true;
        boolean resultadoobtenido = instance.tieneDNIValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
     @Test
    public void testTieneDNIValido2() {
        System.out.println("tieneDNIValido2");
        Paciente instance = new Paciente();
        instance.setDNI("1235678");
        boolean resultadoesperado = false;
        boolean resultadoobtenido = instance.tieneDNIValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
     @Test
    public void testTieneDNIValido3() {
        System.out.println("tieneDNIValido3");
        Paciente instance = new Paciente();
        instance.setDNI("124678");
        boolean resultadoesperado = false;
        boolean resultadoobtenido = instance.tieneDNIValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
     @Test
    public void testTieneDNIValido4() {
        System.out.println("tieneDNIValido1");
        Paciente instance = new Paciente();
        instance.setDNI("12345678");
        boolean resultadoesperado = true;
        boolean resultadoobtenido = instance.tieneDNIValido();
        assertEquals(resultadoesperado, resultadoobtenido);
    }
}
