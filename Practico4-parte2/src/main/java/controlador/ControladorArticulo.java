
package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.Articulo;

public class ControladorArticulo {
    private List<Articulo> articulos;

   public ControladorArticulo() {
        this.articulos = new ArrayList<>();
   }
    
  public void agregarArticulo(Articulo articulo) {
      articulos.add(articulo);
  }
  
  public boolean eliminarArticulo(int codigo){
      return articulos.removeIf(a->a.getCodigo()==codigo);//metodo para iterar, preguntar y eliminar un objeto de la lista. En ete caso la lista articulos.
  }
  
  public List<Articulo> obtenerArticulos(){
      return new ArrayList<> (articulos);
  }
  
}
