package Iniciante;

import java.util.Scanner;

public class Multiplos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if(B % A == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
