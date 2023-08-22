// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import Empleado.Cuadrado;
import Empleado.Triangulo;
import Empleado.Empleado;

public class Main {
    public static void main(String[] args) {
        // Abstraccion
//            System.out.println("Hola POO");
     //       perro jones = new perro();
//            jones.nombre = "loco";
      //      jones.edad = 3;
     //       jones.raza = "Delmer";
     //       jones.miPerro();

     //       perro chamo = new perro();
//            chamo.nombre = "sape";
      //      chamo.edad = 5;
      //      chamo.raza = "Ven";
      //      chamo.miPerro();

     //       Persona emp1 = new Persona();
     //      emp1.nombre = emp1.nombre;
     //       emp1.edad = emp1.edad;
     //       emp1.mostrar();

     //       Persona emp1 = new Persona();
     //       emp1.mostrar();

    //        Empleado emp2 = new Empleado();
     //       emp2.calcularSalarioNeto();


//            System.out.println(jones.miPerro(););


        Empleado emp4 = new Empleado("Carlos",40,300.56f);
        emp4.mostrar();

        Cuadrado cual = new Cuadrado();
        cual.setLado(6);
        System.out.println("El lado mide:" +cual.getLado());
        System.out.println("El perimetro del cuadrado es:" +cual.calcularPerimetro());
        System.out.println("El area del cuadrado es:" +cual.calcularArea());

        Triangulo cuagi = new Triangulo();
        cuagi.settot(6);
        System.out.println("El lado mide:" +cuagi.gettot());
        System.out.println("El perimetro del cuadrado es:" +cuagi.calcularPerimetro());
        System.out.println("El area del cuadrado es:" +cuagi.calcularArea());



        }
    }







