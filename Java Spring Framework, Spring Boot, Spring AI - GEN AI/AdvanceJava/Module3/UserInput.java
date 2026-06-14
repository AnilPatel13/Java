package AdvanceJava.Module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number");

//        int num = System.in.read(); // Asci Value

//        System.out.println("Number is : " + num);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        System.out.println("Number is : " + num);
//
//        br.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number is : " + num);



    }
}
