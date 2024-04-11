package Prenda;

public class Prenda {

  private String nombre;

  private TipoPrenda tipo;

  private Categoria categoria;

  private String material;

  private String colorPrimario;

  private String colorSecundario;

  public Prenda(String nombre, TipoPrenda tipoPrenda, Categoria categoria, String material, String color, String colorSecundario) {
    this.nombre = nombre;
    this.tipo = tipoPrenda;
    this.categoria = categoria;
    this.material = material;
    this.colorPrimario = color;
    this.colorSecundario = colorSecundario;
  }

  public boolean prendaValida(){
    return atributosNoVacios() && cateTipoCorrectos();
  }

  private boolean atributosNoVacios() {
    return this.nombre != null &&  this.tipo != null  && this.material!=null && this.colorPrimario != null;
  }

  private boolean cateTipoCorrectos() {
    return switch (this.tipo) {
      case camisa_mangas_cortas -> this.categoria == Categoria.parte_superior;
      case shorts, pantalon -> this.categoria == Categoria.parte_inferior;
      case zapatos -> this.categoria == Categoria.calzado;
      case gorra -> this.categoria == Categoria.accesorios;
    };
  }
}
