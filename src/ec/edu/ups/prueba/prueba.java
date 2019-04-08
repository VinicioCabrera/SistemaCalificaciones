/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ec.edu.ups.prueba;
import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificaciones;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;
/**
 *
 * @author Usuario
 */
public class prueba {
 public static void main(String[] args){
     
     Sede sedeCuenca=new Sede( 1,"sedeCuenca","calleVieja 12-30","2587596");
     Carrera computacion=new Carrera(1,"computacion",10,45,"Igenieria computacion");
     Carrera telematica=new Carrera(2,"telematica",11,44,"Igenieria telematica");
     Carrera mecatronica=new Carrera(3,"Mecatrinica",9,43,"Igenieria Mecatronica");
     
   
     Materia materia1=new Materia(11,"programacion",6,248,3);
      Materia materia2=new Materia(11,"ecuanciones",6,248,3);
       Materia materia3=new Materia(11,"estructura",6,248,3);
        Materia materia4=new Materia(11,"matematicas",6,248,3);
         Materia materia5=new Materia(11,"Etica",6,248,3);
          Materia materia6=new Materia(11,"programacion",6,248,3);
          
          
        
        
       
        Profesor jenifer=new Profesor("ing en sistemas", 2000, "docente", 0, "Jenifer Yepez", "0215406512", "023115632", "racar", "anafkjfn");
        Profesor paola=new Profesor("ing en sistemas", 2103, "docente", 2, "Paola Ingavelez", "0102175151", "02015120518", "baños", "bbdabdkjand");
        
        Estudiante Pablo=new Estudiante(1, "Pablo", "0107377020", "096874", "Ricaurte", "pab@hotmail.com");
        Estudiante Juan=new Estudiante(2, "Juan", "056156165", "26262662", "sidcay", "jumcioaefnia");
        Estudiante Maria=new Estudiante(3, "Maria", "0101472052", "20125151", "El valle", "mari1@hotail.com|");
        Estudiante Luis=new Estudiante(4, "Luis", "01258415", "2013481", "Sinincay", "Lujnisvn skjv");
        
        Grupo uno=new Grupo(1, "ciencias exactas", 40);
        Grupo dos=new Grupo(2, "profesional", 40);
        
        //HistorialCalificaciones historial=new HistorialCalificaciones( "algebra", 20, 8, 10, 20, "pablo");
        
     
        sedeCuenca.agregarCarrera(materia5);
        sedeCuenca.agregarCarrera(materia4);
        sedeCuenca.agregarCarrera(materia6);
        
        materia1.agregarMateria(materia1);
        materia2.agregarMateria(materia2);
        materia3.agregarMateria(materia3);
        materia4.agregarMateria(materia4);
        materia5.agregarMateria(materia5);
        materia6.agregarMateria(materia6);
        
        materia1.setGrupo(uno);
        materia2.setGrupo(uno);
        materia3.setGrupo(uno);
        materia4.setGrupo(dos);
        materia5.setGrupo(dos);
        materia6.setGrupo(dos);
        
        materia1.setProfesor(paola);
        materia2.setProfesor(paola);
        materia3.setProfesor(paola);
        materia4.setProfesor(jenifer);
        materia5.setProfesor(jenifer);
        materia6.setProfesor(jenifer);
        

        
        //System.out.println(sedeCuenca);
        //sedeCuenca.imprimir();
        
        System.out.println("computacion");
        System.out.println(computacion);
        computacion.imprimir();
       
        System.out.println("telematica");
        System.out.println(telematica);
        materia4.imprimir();
        
        System.out.println("mecatronica");
        System.out.println(mecatronica);
        materia6.imprimir();
        
   
        System.out.println(materia1);
        System.out.println(materia2);
        System.out.println(materia3);
        System.out.println(materia4);
        System.out.println(materia5);
        System.out.println(materia6);
 } 
     
}


