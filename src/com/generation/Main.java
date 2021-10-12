package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// CICLO FOR
//        for (contador = 0; contador < numero; contador++){
//            //codigo que se repite;
//        }

        //Ejemplo
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número: ");
//        int numero = sc.nextInt();
//        for(int i = 1; i <= 10; i++){
//            if (i % 2 == 0){
//                continue; // Va a detener la ejecucion siguiente
//            }  //No multiplica los nuemeros impares
//
//            System.out.println(numero + " x " + i + " = " + (numero * i));



//            if (i == 8){
//                break; //Interrumprir el ciclo
//            }





        //EJERCICIO
//        System.out.println("SERIE FIBONACCI");
//        Scanner sc = new Scanner(System.in);
//        int valor1 = 1, valor2 = 0, valor3 = 0;
//        System.out.println("Ingresa un número: ");
//        int numero = sc.nextInt();
//        for(int i = 0; i < numero; i++){
//            System.out.print(valor3 + " - "); //Alinea los numeros
//            valor3 = valor2;  // 0 = 0
//            valor2 = valor1;  // 0 = 1
//            valor1 = valor1 + valor3; //empieza la suma
//            System.out.println(valor3); //Empieza desde 0
//        }





        //CICLO WHILE DO WHILE - Mientras la condicion sea verdadera se va a repetir en el ciclo

//        while (condicion){
//            //código
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Adivina el número secreto - Ingresa un número");
//        int numero = sc.nextInt();
//        int numeroSecreto = 33;
//
//        while (numero != numeroSecreto){
//            System.out.println("Adivina el número secreto - Ingresa un número");
//            numero = sc.nextInt();
//        }
//        System.out.println("Felicidades adivinaste el número secreto");

        // CICLO DO WHILE - el ciclo solo se cumple una vez

//        Scanner sc = new Scanner(System.in);
//        int numero = 0;
//        int numeroSecreto = 33;
//        do{
//            System.out.println("Adivina el número secreto - Ingresa un número");
//            numero = sc.nextInt();
//        }while (numero != numeroSecreto);
//        System.out.println("Felicidades adivinaste el número secreto");

        //EJERCICIO
        //Perdir un numero y sacar el factorial

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un número");
        int numero = sc.nextInt();
        int i = 1;
        int f = 1;

        while ( i <= numero){
        f = f*i;
        i++;
            System.out.println("El factorial es:" + f);
        }





    }
}
