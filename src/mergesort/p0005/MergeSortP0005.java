/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort.p0005;
import java.util.Scanner;
/**
 *
 * @author HE170417
 */
public class MergeSortP0005 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
        Scanner sc = new Scanner(System.in);
        Procedure p = new Procedure();
        System.out.println("Please enter a positive integer");
        input = sc.nextInt();
        int numberList[] = new int[input];
        p.generateNumber(numberList, input);
        System.out.println("Unsorted");
        p.display(numberList);
        p.mergeSort(numberList, 0, numberList.length-1);
        System.out.println("Sorted");
        p.display(numberList);
        //test
        //test Again
    }
    
}
