/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_05;

/**
 *
 * @author Muhammad Irman Syakir Bin Ismail_s62354
 */
public class ArrayMethodWithException {

    public static void main(String[] args) {
        try {
            int[] number = {1,2,3,4,5};
            System.out.println(getNumber(number,5));
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Capaian diluar indeks\n"+ae.toString());
        }
    }
    
    public static int getNumber(int[] m, int i) {
        if (i >= m.length) {
            throw new ArrayIndexOutOfBoundsException("Range index is greater than size");
        }
        return m[i];
    }
}
