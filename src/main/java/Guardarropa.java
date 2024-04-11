import Prenda.Prenda;
import Prenda.TipoPrenda;
import Prenda.Categoria;

import java.util.List;


public class Guardarropa {
  private List<Prenda> Prendas;

  public void agregarPrenda(String nombre, TipoPrenda tipoPrenda, Categoria categoria, String material, String color, String colorSecundario){
    Prenda prenda = new Prenda(nombre,tipoPrenda,categoria,material,color,colorSecundario);
    if (prenda.prendaValida())
      this.Prendas.add(prenda);
    else
      System.out.println("prenda no valida");
  }

  public Guardarropa(List<Prenda> prendas) {
    Prendas = prendas;
  }
}
