/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
* @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public class Sede {
private int codigo ;
private String nombre ;
private String direccion ;
private String telefono ;
// private carreras : List<Carrera>
 
public void setCodigo(int codigo){
    this.codigo=codigo;
}
public int getCodigo(){
    return this.codigo;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public String getNombre(){
    return this.nombre;
}
public void setTelefono(String telefono){
    this.telefono=telefono;
}
public String getTelefono(){
    return this.telefono;
}


public void setDireccion(String direccion){
    this.direccion=direccion;
}
public String getDireccion(){
    return this.direccion;
}
}
