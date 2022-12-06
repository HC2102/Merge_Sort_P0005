/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort.p0005;
import java.util.Random;

/**
 *
 * @author HE170417
 */
public class Procedure {

    public Procedure() {
    }
    
    public void generateNumber(int[]numberList,int bound){
        Random rand = new Random();
        for(int i =0; i <numberList.length;i++){
            numberList[i] = rand.nextInt(bound);
        }
    }
    public void display(int[] numberList){
        System.out.print("{ ");
        for(int i =0; i<numberList.length;i++){
            System.out.print(numberList[i]+" ");
        }
        System.out.println("}");
    }
    public void mergeSort(int[] numberList, int left, int right){     
        /**
         * divide and conquer
         */    
        if(left<right){
            //find the middle point
            int mid = left+(right-left)/2;
            //sort the first the second halves
            mergeSort(numberList, left, mid);
            mergeSort(numberList, mid+1, right);
            //merge the sorted halves
            merge(numberList, left, mid, right);
        }
    }
    public void merge(int numberList[], int left, int mid, int right){
        //find size of 2 subarrays to be merged
        int n1 = mid - left+1;
        int n2 = right -mid;
        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
        //copy data to temp arrays
        for(int i = 0; i<n1;++i){
            L[i]= numberList[i+left];
        }
        for(int j = 0; j <n2; ++j){
            R[j] = numberList[mid+1+j];
        }
        
        /*Merge the temp arrays*/
        //Initial indexes of first and second subarrays
        int i =0, j = 0;
        //Initial index of merged subarray
        int k =left;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                numberList[k] = L[i];
                i++;
            }
            else{
                numberList[k] = R[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements of L[] if any
        while(i<n1){
            numberList[k] = L[i];
            i++;
            k++;
        }
        //copy remaining elements of R[] if any
        while(j<n2){
            numberList[k] = R[j];
            j++;
            k++;
        }
        
    }
}
