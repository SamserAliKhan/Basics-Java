package Basics;

public class MargeSort {
    
    public static void PrintArr(int A[]) {
        for(int i =0 ; i<A.length;i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }

    //                 margeSort(A,0,A.length-1);
    public static void margeSort(int A[], int si, int ei) {
        if(si>=ei){
            return;
        }  //Base Case

        //kaam
        int mid = si + ((ei - si)/2);
        margeSort(A, si, mid);      //Left
        margeSort(A, mid+1, ei);    //Rigth

        marge(A,si,mid,ei);
    }

    private static void marge(int[] a, int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int n = si;
        int m = mid+1;
        int o = 0;
        while(n<=mid && m<=ei){

            if(a[n]<a[m]){
                temp[o] = a[n];
                n++;
            }
            else{
                temp[o] = a[m];
                m++;
            }
            o++;
        }
        //For the left over array

        //Left part
        while(n<=mid){
        temp[o++] = a[n++];
        }

        //Right part
        while(m<=ei){
        temp[o++] = a[m++];
        }

        //copy temp array to orignal array
        for(o=0,n=si;o<temp.length;o++,n++){
        a[n] = temp[o];
        }

    }
    public static void main(String[] args) {
        int A[]={6,3,9,5,2,8};
        margeSort(A,0,A.length-1);
        
        PrintArr(A);
    }
    
}
