package Basics;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int A[],n;
        try(Scanner sc= new Scanner(System.in)){
            n=sc.nextInt();
            A=new int[n];
            for(int i=0;i<n;i++){
                A[i]=sc.nextInt();
            }
        }
        Print1D(n, A);
    }
    //Double Dimention array Input Function
    public static int[][] Input2D(){
        int A[][],row,col;
        try(Scanner sc=new Scanner(System.in)){
            row=sc.nextInt();
            col=sc.nextInt();
            A=new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    A[i][j]=sc.nextInt();
                }
            }
        }
        return A;
    }
    public static void Print1D(int n,int A[]){
        for(int i=0;i<n;i++)
        System.out.println(A[i]);
    }
    
}
