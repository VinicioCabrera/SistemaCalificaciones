/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//https://github.com/VinicioCabrera/Sistemacalificaciones.git


package ec.edu.ups.prueba;
import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificaciones;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class prueba {
 public static void main(String[] args){
     
     Carrera c=new Carrera();  
     c.setCodigo(1002);
     c.setNombre("Computacion");
     c.setNumeroEstudiantes(20);
     c.setNumeroSemestre(3);
     c.setTitulo("Ingeniero en ciencias de la computacion");
     int caCo=c.getCodigo();
     String caNom=c.getNombre();
     int caNuEs=c.getNumeroEstudiantes();
     int caNuSe=c.getNumeroSemestre();
     String caTi=c.getTitulo();
     System.out.println("Codigo: "+caCo);
     System.out.println("Nombre: "+caNom);
     System.out.println("Numero de estudiante: "+caNuEs);
     System.out.println("Numero del semestre: "+caNuSe);
     System.out.println("Titulo: "+caTi);
     
     Estudiante es=new Estudiante();
     es.setEstudiante("juan calle");
     String esEs=es.getEstudiante();
     System.out.println("Estudiante: "+esEs);
     
     Grupo gru=new Grupo();
     gru.setCodigo(1020);
     gru.setNombre("Programacion Aplicada");
     gru.setCupo(12);
     int gCo=gru.getCodigo();
     String gNo=gru.getNombre();
     int gCu=gru.getCupo();
     System.out.println("Codigo: "+gCo);
     System.out.println("Nombre: "+gNo);
     System.out.println("Cupo: "+gCu);
     
     Profesor pro=new Profesor();
     pro.setCargo("Gefe de Area");
     pro.setSalario(900.12);
     pro.setTitulo("Ingeniero");
     String pCa=pro.getCargo();
     double pSa=pro.getSalario();
     String pTi=pro.getTitulo();
     System.out.println("Cargo: "+pCa);
     System.out.println("Salario: "+pSa);
     System.out.println("Titulo: "+pTi);
     
     Persona pe=new Persona();
     pe.setCedula("0105826987");
     pe.setCodigo(20154);
     pe.setCorreo("Juan_12@hotmail.com");
     pe.setDireccion("AV.benigno malo");
     pe.setNombre("juan");
     pe.setTelefono("4058489");
     String peCed=pe.getCedula();
     int peCod=pe.getCodigo();
     String peCorr=pe.getCorreo();
     String peDire=pe.getDireccion();
     String peNo=pe.getNombre();
     String peTelf=pe.getTelefono();
     System.out.println("Cedila: "+peCed);
     System.out.println("Codigo: "+peCod);
     System.out.println("Correo: "+peCorr);
     System.out.println("Direccion: "+peDire);
     System.out.println("Nombre: "+peNo);
     System.out.println("Telefono: "+peTelf);
     /*ArrayList<String>sde;
     sde=new ArrayList<String>();
     sde.add();
     for (int i=0;i<sde.size();i++){
       System.out.println(sde.get(i));  
     }*/
     
     Sede se=new Sede();
     se.setCodigo(20154);
     se.setDireccion("AV.benigno malo");
     se.setNombre("juan");
     se.setTelefono("4058489");
     int seCod=pe.getCodigo();
     String seDire=pe.getDireccion();
     String seNo=pe.getNombre();
     String seTelf=pe.getTelefono();
     System.out.println("Codigo: "+seCod);
     System.out.println("Direccion: "+seDire);
     System.out.println("Nombre: "+seNo);
     System.out.println("Telefono: "+seTelf);
     
     Materia ma=new Materia();
     ma.setCodigo(2154);
     ma.setNumeroCreditos(6);
     ma.setNombre("juan");
     ma.setNumeroHoras(248);
     ma.setNivel(3);
     int maCod=ma.getCodigo();
     int maNuCe=ma.getNumeroCreditos();
     String maNo=ma.getNombre();
     int maNuHo=ma.getNumeroHoras();
     int maNi=ma.getNivel();
     System.out.println("Codigo: "+maCod);
     System.out.println("Numero de creditos: "+maNuCe);
     System.out.println("Nombre: "+maNo);
     System.out.println("Numero de horas: "+maNuHo);
     System.out.println("Nivel: "+maNi);
     
     HistorialCalificaciones hica=new HistorialCalificaciones();
     hica.setAprovechamiento1(9);
     hica.setAprovechamiento2(10);
     hica.setExamen1(12);
     hica.setExamen2(11);
     int hicaApro1=hica.getAprovechamiento1();
     int hicaApro2=hica.getAprovechamiento2();
     int hicaExa1=hica.getExamen1();
     int hicaExa2=hica.getExamen2();
     System.out.println("Aprovechamiento1: "+hicaApro1);
     System.out.println("Aprovechamiento2: "+hicaApro2);
     System.out.println("Examen1: "+hicaExa1);
     System.out.println("Examen2: "+hicaExa2);
 }  
     
}
