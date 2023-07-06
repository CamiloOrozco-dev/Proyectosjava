package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creando objetos

        Samurai objetoSamurai = new Samurai();
        Samurai objetoSamuraiDos = new Samurai();
        Herramienta objetoHerramienta = new Herramienta("escopeta",50.0);
        Herramienta objetoHerramientaDos = new Herramienta();
        Scanner entradaPorTeclado = new Scanner(System.in);

        //UTILIZAR - ACCEDER - MODIFICAR - VALIDAR - OPERAR - REVISAR
        //LOS ATRIBUTOS Y METODOS DE UNA CLASE

        objetoSamurai.setNombres("Alexis Kumato");
        System.out.print("Ingrese la edad del primer Samurai: ");
        objetoSamurai.setEdad(entradaPorTeclado.nextInt());

        System.out.print("Ingrese el nombre del segundo Samurai: ");
        objetoSamuraiDos.setNombres(entradaPorTeclado.nextLine());
        //Diferencia entre .next() y nextLine()
        //.next() permite ingresar valores tipo string pero solo hasta el salto de linea
        //.nextLine() permite ingresar strings compuestos con saltos de linea
        System.out.print("********* RESULTADOS *********");
        System.out.println("El samurai: "+objetoSamurai.getNombres()+ " tiene "+objetoSamurai.getEdad() );
    }
}