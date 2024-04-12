import Prendas.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class guardarropaTests {
    private Guardarropa guardarropa;
    @BeforeEach
    public void init(){
      guardarropa = new Guardarropa();
    }
    @Test
    public void laRopaEsValida(){
      Prenda prenda = new Prenda("remera con dibujo dinosario", TipoPrenda.camisa_mangas_cortas,Categoria.parte_superior,"tela","ROJO", "verde");
      guardarropa.agregarPrenda(prenda);
      Assertions.assertEquals(1,guardarropa.getPrendas().size());
    }

    @Test
    public void laRopaTieneAtributosVacios(){
      Prenda prenda = new Prenda("remera con dibujo dinosario", null,Categoria.parte_superior,"tela","ROJO", "verde");
      guardarropa.agregarPrenda(prenda);
      Assertions.assertEquals(0,guardarropa.getPrendas().size());
    }

    @Test
    public void laRopaNoTieneCategoriaYtipoCorrectos(){
      Prenda prenda = new Prenda("remera con dibujo dinosario", TipoPrenda.shorts,Categoria.parte_superior,"tela","ROJO", "verde");
      guardarropa.agregarPrenda(prenda);
      Assertions.assertEquals(0,guardarropa.getPrendas().size());
    }



}
