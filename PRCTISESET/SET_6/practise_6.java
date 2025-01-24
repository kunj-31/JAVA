package PRCTISESET.SET_6;

import java.util.Scanner;

public class practise_6 {
    public static void main(String[] args) {

        // problem 1
        /*
         * System.out.printf("enter the size of the array:");
         * Scanner index = new Scanner(System.in);
         * int size = index.nextInt();
         * float[] arr = new float[size];
         * 
         * for (int i = 0; i < size; i++) {
         * arr[i] = index.nextFloat();
         * }
         * 
         * System.out.printf("the array is:");
         * System.out.printf("\n");
         * for (int i = 0; i < size; i++) {
         * System.out.println(arr[i]);
         * }
         * System.out.printf("\n");
         * 
         * float sum = 0;
         * for (int i = 0; i < size; i++) {
         * sum = sum + arr[i];
         * }
         * System.out.printf("the sum of the array is:" + sum);
         * index.close();
         */

        // problem-2
        /*
         * int [] arr = {1,2,3,4,5,6,7,8,9,10};
         * int num=5;
         * boolean isPresent=false;
         * int index=-1;
         * for(int i=0;i<arr.length;i++){
         * if(num==arr[i]){
         * isPresent=true;
         * index=i;
         * break;
         * }
         * }
         * if(isPresent){
         * System.out.printf("the number is present at index:"+index);
         * }
         * else{
         * System.out.printf("the number is not present in the array");
         * }
         */

        // problem-3
        /*
         * System.out.printf("enter the size of the array:");
         * Scanner index = new Scanner(System.in);
         * int size = index.nextInt();
         * float[] arr = new float[size];
         * 
         * for (int i = 0; i < size; i++) {
         * arr[i] = index.nextFloat();
         * }
         * 
         * System.out.printf("the array is:");
         * System.out.printf("\n");
         * for (int i = 0; i < size; i++) {
         * System.out.println(arr[i]);
         * }
         * System.out.printf("\n");
         * 
         * float sum = 0;
         * for (int i = 0; i < size; i++) {
         * sum = sum + arr[i];
         * }
         * System.out.printf("the avarage of the physics marks of student:" +
         * sum/arr.length);
         * index.close();
         */

        // problem-4
        /*
         * Scanner index = new Scanner(System.in);
         * System.out.print("Enter the number of rows: ");
         * int rows = index.nextInt();
         * System.out.print("Enter the number of columns: ");
         * int cols = index.nextInt();
         * 
         * int[][] arr = new int[rows][cols];
         * 
         * System.out.println("The first array is:");
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[i].length; j++) {
         * arr[i][j] = index.nextInt();
         * }
         * }
         * 
         * System.out.println("The second array is:");
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[i].length; j++) {
         * arr[i][j] = index.nextInt();
         * }
         * }
         * 
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[i].length; j++) {
         * arr[i][j] += arr[i][j];
         * }
         * }
         * 
         * System.out.println("The array is:");
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[i].length; j++) {
         * System.out.print(arr[i][j] + " ");
         * }
         * System.out.println();
         * }
         * index.close();
         */

        // problem-5
        // reverse the array
        /*
         * Scanner index = new Scanner(System.in);
         * System.out.print("Enter the size of the array: ");
         * int size = index.nextInt();
         * int[] arr = new int[size];
         * for(int i=0;i<size;i++){
         * arr[i]=index.nextInt();
         * }
         * //second method to reverse the array
         * for(int i=0;i<size/2;i++){
         * int temp=arr[i];
         * arr[i]=arr[size-i-1];
         * arr[size-i-1]=temp;
         * }
         * for(int i=0;i<size;i++){
         * System.out.println(arr[i]);
         * }
         * index.close();
         */

        // problem-6
        /*
         * Scanner index = new Scanner(System.in);
         * System.out.print("enter the size of the array:");
         * int size = index.nextInt();
         * int arr[] = new int[size];
         * 
         * for (int i = 0; i < size; i++) {
         * arr[i] = index.nextInt();
         * }
         * int max = 0;
         * for (int i = 0; i < size; i++) {
         * if (arr[i] > max) {
         * max = arr[i];
         * }
         * }
         * System.out.print("the maximum element in this array is:" + max);
         * 
         * index.close();
         */

        // problem-7
        /*
         * Scanner index=new Scanner(System.in);
         * System.out.print("enter the size of the array:");
         * int size=index.nextInt();
         * int arr[]=new int[size];
         * for(int i=0;i<size;i++){
         * arr[i]=index.nextInt();
         * }
         * int min=Integer.MAX_VALUE;
         * for(int i=0;i<size;i++){
         * if(min>arr[i]){
         * min=arr[i];
         * }
         * }
         * System.out.println("the min element in this array is:"+min);
         * index.close();
         */

        // problem-8
        /*
         * Scanner index=new Scanner(System.in);
         * System.out.print("enter the size of the array:");
         * int size=index.nextInt();
         * int arr[]=new int[size];
         * for(int i=0;i<size;i++){
         * arr[i]=index.nextInt();
         * }
         * boolean sorted=true;
         * for(int i=0;i<size-1;i++){
         * if(arr[i]>arr[i+1]){
         * sorted=false;
         * break;
         * }
         * }
         * if(sorted){
         * System.out.println("array is sorted");
         * }
         * else{
         * System.out.println("array is not sorted");
         * }
         * index.close();
         */

        // pr0blem-9
        Scanner index = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size = index.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = index.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int l = 0; l < size; l++) {
            System.out.println(arr[l]);
        }

        index.close();
    }
}