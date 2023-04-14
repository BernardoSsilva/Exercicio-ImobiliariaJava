package imobiliaria;

import java.util.Scanner;

public class controleDados{
    public double largura, comprimento, valorm2, total;
    // atributos

    // metodo, as ações que serão realizados, semelhante a procedure por não tetornar nada.
    // void não retorna nada
    public void recebeDados(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Digite o valor do m²: ");
        valorm2 = sc.nextDouble();
        total = (largura*comprimento)*valorm2;
    }

    public void mostraDados(){
        System.out.println("<Mostrar valor>");
        System.out.println(" ");
        System.out.println("O valor total é de: "+total);
    }

} 