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
public class Materia {
private int codigo ;
private String nombre ;
private int numeroCreditos;
private int numeroHoras ;
private int nivel ;
//private String [] grupo ;
//private String []profesor ;

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
public void setNumeroCreditos(int numeroCreditos){
    this.numeroCreditos=numeroCreditos;
}
public int getNumeroCreditos(){
    return this.numeroCreditos;
}
public void setNumeroHoras(int numeroHoras){
    this.numeroHoras=numeroHoras;
}
public int getNumeroHoras(){
    return this.numeroHoras;
}
public void setNivel (int nivel ){
    this.nivel =nivel ;
}
public int getNivel (){
    return this.nivel ;
}



}
