/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Malena
 */
public class Importado extends Articulo {
    private int anioImportacion;
    private float impuesto;

    public Importado(int codigo, String nombre, float precioCosto, int anioImportacio, float impuesto) {
        super(codigo, nombre, precioCosto);
        this.anioImportacion=anioImportacion;
        this.impuesto=impuesto;
    }

    public int getAnioImportacion() {
        return anioImportacion;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }
    
    
    public float CalcularPrecioVenta(){
        return 0;
    }
    
    
    
    //método que devulave el tipo de artículo
    public String tipoArticulo() {
        return "Artículo Importado";
    }
}
