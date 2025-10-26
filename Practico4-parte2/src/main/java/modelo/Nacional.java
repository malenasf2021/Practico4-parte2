/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Malena
 */
public class Nacional extends Articulo{
    private String departamento;
    private boolean subsidiado;
    private float precioVenta;

    public Nacional(int codigo, String nombre, float precioCosto, String departamento, boolean subsidiado) {
        super(codigo, nombre, precioCosto);
        this.departamento=departamento;
        this.subsidiado=subsidiado;
        this.precioVenta=calculoPrecioVenta();
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public boolean isSubsidiado() {
        return subsidiado;
    }

    public void setSubsidiado(boolean subsidiado) {
        this.subsidiado = subsidiado;
    }
    
    public float calculoPrecioVenta(){
        float precio=(float) (super.getPrecioCosto() * 1.20);
        if(this.subsidiado==false){
             precio= (float) (precio * 1.15);
           if(this.departamento=="interior"){
                precio= (float) (precio * 1.1);
           }
        }
        return precio;
    }
    
            
    //método que devulave el tipo de artículo
    public String tipoArticulo() {
        return "Artículo Nacional";
    }
}
