import Prendas.Prenda;

import java.util.ArrayList;
import java.util.List;


public class Guardarropa {
  private List<Prenda> Prendas;

  public void agregarPrenda(Prenda prenda){
    if (prenda.prendaValida()) {
      this.Prendas.add(prenda);
      System.out.println("Prenda agregada con exito");
    }
    else
       System.out.println("prenda no valida");
  }

  public Guardarropa() {
    Prendas = new ArrayList<>();
  }

  public List<Prenda> getPrendas() {
    return Prendas;
  }

  public void setPrendas(List<Prenda> prendas) {
    Prendas = prendas;
  }
}

