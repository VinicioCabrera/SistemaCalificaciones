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


public class Carrera {
private int codigo;
private String nombre;
private Materia[] materias;
private int numeroSemestres; 
private int numeroEstudiantes;
private String titulo;

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

/*public void setMaterias( String materias){
   this.materias=materias; 
}
public String getMaterias(){
    return this.materias;
}*/
public void setNumeroSemestre(int numeroSemestre){
    this.numeroSemestres=numeroSemestre;
}
public int getNumeroSemestre(){
    return this.numeroSemestres;
}
public void setNumeroEstudiantes(int numeroEstudiantes){
    this.numeroEstudiantes=numeroEstudiantes;
}
public int getNumeroEstudiantes(){
    return this.numeroEstudiantes;
}
public void setTitulo(String titulo){
    this.titulo=titulo;
}  
public String getTitulo(){
    return this.titulo;
} 
}