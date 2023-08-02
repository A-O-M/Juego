package com.mygdx.game;

public class Menu {public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);

    boolean salir = false;
    int opcion;

    while(!salir){

       System.out.println("\n\t-- Programa que muestra un menu con opciones de ejercicios de las diferentes estructuras --");

       System.out.println("1.- Funciones");
       System.out.println("2.- Recursividad");
       System.out.println("3.- Metodo de ordenacion de insercion");
       System.out.println("4.- Metodo de ordenacion Shell");
       System.out.println("5.- Listas de personas");
       System.out.println("6.- Pilas");
       System.out.println("7.- Colas");
       System.out.println("8.- Salir");

       try{

          System.out.println("Seleccione la opcion deseada: ");
          opcion = sn.nextInt();

          switch (opcion){
          case 1:
             Ejercicios.funciones();
             break;
          case 2:
             Ejercicios.recursividad();
             break;
          case 3:
             Ejercicios.ordenacionInsercion();
             break;
          case 4:
             Ejercicios.ordenacionShell();
             break;
          case 5:
             Ejercicios.listaPersonas();
             break;
          case 6:
             Ejercicios.metodoPilas();
             break;
          case 7:
             Ejercicios.metodoColas();
             break;
          case 8:
             salir=true;
             break;   
          default:   
             System.out.println("Las opciones son entre 1 y 8");

          }
       }
       catch(InputMismatchException e){
          System.out.println("Debes seleccionar un numero de opcion");
          sn.next();
       }
    }

    System.out.println("Gracias por utilizar el sistema, hasta luego... ");
 }
   
}
