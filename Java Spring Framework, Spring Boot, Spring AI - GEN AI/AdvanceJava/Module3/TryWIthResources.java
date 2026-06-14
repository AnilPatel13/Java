package AdvanceJava.Module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWIthResources {

    public static void main(String[] args) throws IOException {
//        int i =0;
//        BufferedReader br = null;
//        try {
//
//            br = new BufferedReader(new InputStreamReader(System.in));
//            int j = Integer.parseInt(br.readLine());
//            int k = j/i;
//            System.out.println("Result : " + k);
//
//        }
//        catch (Exception e) {
//            System.out.println("Exception : " + e);
//        }
//        finally {
//            br.close();
//        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int j = Integer.parseInt(br.readLine());
            int k = j/0;
            System.out.println("Result : " + k);
        }
        catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}
