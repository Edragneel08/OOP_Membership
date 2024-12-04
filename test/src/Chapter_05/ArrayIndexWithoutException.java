/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Muhammad Irman Syakir Bin Ismail_s62354
 */
public class ArrayIndexWithoutException {

    public static void main(String[] args) {
        try {
            
            Scanner in = new Scanner(System.in);
            System.out.println("Key in Number : ");
            int number = in.nextInt();
            System.out.println("Number : "+number);
            
            System.out.println("Chapter_05.ArrayIndexWithoutException.main()");
            double[] cgpa = {3.7, 3.8, 3.9, 4.0};
            System.out.println(cgpa[5]);
            
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("INDEX DOES NOT EXIST\n" + ae.getMessage() + "\n" + ae.toString());
            
        } catch (InputMismatchException ie) {
            System.out.println("Wrong data type!");
        }
        finally{
            
        }
    }
}
