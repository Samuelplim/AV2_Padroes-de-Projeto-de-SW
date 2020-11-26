package main;

import entities.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FacadeSorvete sorvetao;
        sorvetao = new FacadeSorvete(new Sorvete("Menta",1), new Recipiente(new Copo(500)), new Decoracao("balas de gelatina", 2, "finis minhocas citricas"));
        System.out.println(sorvetao.encomendarSorvete());
    }
    
}
