/*
*@Author Emircan Aktaş - 16.Dec.2022
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Area formula : π * r * r;
        Perimeter formula : 2 * π * r;
         */

        double r,area,perimeter;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter r :");
        r = inp.nextDouble();
        area = Math.PI * r * r;
        perimeter = 2 * Math.PI * r;

        System.out.println("Circle area result :" + area);
        System.out.println("Circle perimeter result :" + perimeter);




    }
}