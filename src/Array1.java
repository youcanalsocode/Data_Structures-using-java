import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array1 {
    public  static int []remove_array(int arr[], int index) {
        if (arr == null || index > arr.length || index < 0) {
            return arr;
        }
        //method -1(creating a new array)*****************************************************
        int arnew[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            arnew[i] = arr[i];
        }
        return arnew;
        //method -2(using intstream)********************************************************************************
       /* return IntStream.range(0,arr.length)
            .filter(i->i!=index)
                .map(i->arr[i])
                .toArray();*/





    }
    public static void main(String args[]){
        // ways to declare array
        int ar1[]=new int[2];
        int ar2[];
        ar2=new int[2];
         int ar3[]={1,2,3,4,5,6};

         //types of array
        //single d
        int ars[]=new int[2];
        //double d
        int ard[][]= new int[2][3];

        //operations on array
        //traversal
        for (int i = 0; i <ar3.length ; i++) {
            System.out.println(ar3[i]);
        }
        //Insertion
        ar1[0]=2;
        System.out.println(ar1[0]);
        //deletion
        //two ways to delete .mentioned in the remove_array method
        int newarray[]=remove_array(ar3,3);
        /*for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i]);
        }*/
        System.out.println(Arrays.toString(newarray));
        /*searching an element in an array*/
        int x=4;
        /*linear method (O(n))*/
        Boolean b=false;
        int a=-1;
        for (int i = 0; i < ar3.length; i++) {
            if(ar3[i]==x){
                b=true;
                a=i;
            }

        }
        if (b==true){
            System.out.println("the value is found at index :"+a);
        }else{
            System.out.println("no such value is found");
        }
 /*sorting array*/
        int art[]={2,3,5,7,1};
        System.out.println("unsorted array"+Arrays.toString(art));
        Arrays.sort(art);
        System.out.println("sorted array"+Arrays.toString(art));



    }

}
