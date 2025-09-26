package alumnos.psp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoControlador {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        AlumnoVista vista = new AlumnoVista();
        List<Alumno> alumnos = new ArrayList<>();
        boolean salir=true;
         

        while (salir  ) {
            System.out.println("1. Insetar alumno");
            System.out.println("2. listar alumnos");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                try {
                    System.out.println("Nombre: ");
                     String nombre = sc.nextLine();
                     System.out.println("Apellido: ");
                     String apellido = sc.nextLine();
                     System.out.println("Edad: ");
                     int edad= sc.nextInt();
                      sc.nextLine();
                     
                     Alumno alumno = new Alumno(nombre, apellido, edad);
                    alumnos.add(alumno);
                } catch (Exception inserAlum) {
                  System.out.println("Error al insertar alumno");
                }
                     
                    break;
                  case 2:
                  try {
                      vista.mostrarListaAlumnos(alumnos);
                  } catch (Exception verAlumn) {
                     System.out.println("Error al listar el alumno");
                  }
                  
                  break;
                  case 3:
                    salir =false;
                  break;

                default:
                    break;
            }
            
        }

        sc.close();
    }
    
}
