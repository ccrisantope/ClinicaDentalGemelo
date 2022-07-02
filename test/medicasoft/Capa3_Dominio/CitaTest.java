
package medicasoft.Capa3_Dominio;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;


public class CitaTest {
    
    public CitaTest() {
    }

  
    @Test
    public void testCalcularcostocitatotal1() {
        System.out.println("calcularcostocitatotal");
        Cita instance = new Cita();
        instance.setCosto(100);
        instance.setDescuento(20);
        double resultadoesperado = 80;
        double resultadoobtenido = instance.calcularcostocitatotal();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
  }
  
   @Test
    public void testCalcularcostocitatotal2() {
        System.out.println("calcularcostocitatotal2");
        Cita instance = new Cita();
        instance.setCosto(50);
        instance.setDescuento(20);
        double resultadoesperado = 40;
        double resultadoobtenido = instance.calcularcostocitatotal();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
  }  
     @Test
    public void testCalcularcostocitatotal3() {
        System.out.println("calcularcostocitatotal3");
        Cita instance = new Cita();
        instance.setCosto(40);
        instance.setDescuento(25);
        double resultadoesperado = 30;
        double resultadoobtenido = instance.calcularcostocitatotal();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
  }
     @Test
    public void testCalcularcostocitatotal4() {
        System.out.println("calcularcostocitatotal4");
        Cita instance = new Cita();
        instance.setCosto(80);
        instance.setDescuento(25);
        double resultadoesperado = 60;
        double resultadoobtenido = instance.calcularcostocitatotal();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
  }
    
   @Test
    public void testTieneDescuento1() {
        System.out.println("tieneDescuento1");
        Cita instance = new Cita();
        instance.setDescuento(25);
        double resultadoesperado = 0.25;
        double resultadoobtenido = instance.tieneDescuento();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
       
    }
     @Test
    public void testTieneDescuento2() {
        System.out.println("tieneDescuento2");
        Cita instance = new Cita();
        instance.setDescuento(20);
        double resultadoesperado = 0.20;
        double resultadoobtenido = instance.tieneDescuento();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
       
    }
     @Test
    public void testTieneDescuento3() {
        System.out.println("tieneDescuento3");
        Cita instance = new Cita();
        instance.setDescuento(40);
        double resultadoesperado = 0.40;
        double resultadoobtenido = instance.tieneDescuento();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
 
    }
     @Test
    public void testTieneDescuento4() {
        System.out.println("tieneDescuento3");
        Cita instance = new Cita();
        instance.setDescuento(55);
        double resultadoesperado = 0.55;
        double resultadoobtenido = instance.tieneDescuento();
        assertEquals(resultadoesperado, resultadoobtenido, 0.0);
       
    }
 
}
