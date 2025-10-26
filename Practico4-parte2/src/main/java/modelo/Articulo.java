
package modelo;

/**
 *
 * @author Malena
 */
public abstract class Articulo {
    
    //atributos del articulo
    private int codigo;
    private String nombre;
    private float precioCosto;
    
    //contructor
    public Articulo(int codigo, String nombre, float precioCosto){
        this.codigo= codigo;
        this.nombre= nombre;
        this.precioCosto= precioCosto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    //solo el precio de costo se modifica
    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }
    
    //cálculo del precio de venta
    public float precioVenta(){
        return (float) (precioCosto + (precioCosto*0.20)); 
    }
    
    //método abstracto que devulave el tipo de artículo
    //está definido en cursiva en el UML
    public abstract String tipoArticulo();
    
    
}
