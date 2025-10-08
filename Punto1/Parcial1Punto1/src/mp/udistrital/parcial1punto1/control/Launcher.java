package mp.udistrital.parcial1punto1.control;

import mp.udistrital.parcial1punto1.observer.CommunityManager;
import mp.udistrital.parcial1punto1.observer.Periodista;
import mp.udistrital.parcial1punto1.observer.Webmaster;
import mp.udistrital.parcial1punto1.subject.Edco;

/**
 *
 * @author Estudiantes
 */
public class Launcher {

    public static void main(String[] args) {
        System.out.println(" -SISTEMA DE NOTIFICACION DE CURSOS EDCO- ");
        System.out.println("");
        
        Edco edco = new Edco();
        
        Webmaster andrea = new Webmaster("Andrea Mahecha", "001", edco);
        Periodista luzDary = new Periodista("Luz Dary Varela", "002", edco);
        CommunityManager laura = new CommunityManager("Laura Molano", "003", edco);
        
        System.out.println("");
        System.out.println("Sucribir usuarios a edco");
        andrea.suscribirse();
        luzDary.suscribirse();
        laura.suscribirse();
        
        System.out.println("");
        System.out.println("Publicar primer curso");
        edco.publicarNuevoCurso("Inteligencia Artificial", "Curso especializado sobre el uso de IA", "Tecnologia",40,"Profe 1");
        
        System.out.println("");
        System.out.println("Dar de baja a laura la communitymanager");
        laura.darseDeBaja();
        
        System.out.println("");
        System.out.println("Publicar otro curso");
        edco.publicarNuevoCurso("Pedagogia","Exploracion de enfoques pedagogicos","Pedagogia",30,"Profe 2");
        
        System.out.println("");
        System.out.println("Dar de baja a andrea la webmaster");
        andrea.darseDeBaja();
        
        System.out.println("");
        System.out.println("Publicar otro curso");
        edco.publicarNuevoCurso("Matematicas 1","Clases de matematicas 1","Matematicas",35,"Profe 3");
        
        System.out.println("");
        System.out.println("-SISTEMA EDCO FINALIZADO-");
    }
}