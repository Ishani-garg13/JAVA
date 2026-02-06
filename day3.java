// class day3{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};
//         // System.out.println(arr[2]);
//         // arr[3]=60;
//         // System.out.println(arr[3]);
//         // System.out.println(arr.length);
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         for(int x:arr){
//             System.out.println(x);
//         }
//     }
// }
//---------------------------------------------------
//Taking array input
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//     }
// }
//-----------------------------------------------
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
//-------------------------------------------------
//Sum of all digits in an array
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<n;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println(sum);
//     }
// }
//--------------------------------------------------
// //Count even numbers
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int count=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]%2==0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
//------------------------------------------------------
// // //Find Max element
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.print(max);
//     }
// }
//--------------------------------------------------
// //Find Min element
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         int[] arr={5,10,12,3,9};
//         int n=arr.length;
//         int min=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         System.out.print(min);
//     }
// }
//----------------------------------------------------
//Reverse an Array
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
//--------------------------------------------------
// //check if sorted
// import java.util.Scanner;
// class day3{
//     public static void main(String[] args){
//         int[] arr={1,2,3,7,5};
//         int n=arr.length -1;
//         int count=0;
//         boolean hai=true;
//         for(int i=0;i<n;i++){
//             if(arr[i]>arr[i+1]){
//                 hai=false;
//                 break;
//             }
//         }
//         if(hai==true){
//         System.out.print("Sorted");
//         }
//         else{
//             System.out.print("Not Sorted");
//         }
//     }
// }
//-------------------------------------------------
//Second largest
// import java.util.*;
// class day3{
//     public static void main(String[] args){
//         int[] arr={5,1,12,3,10};
//         int lar=arr[0];
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             if(arr[i]>lar){
//                 lar=arr[i];
//             }
//         }
//         int sl=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(arr[i]>sl && arr[i]!=lar){
//                 sl=arr[i];
//             }
//         }
//         System.out.println(sl);
//     }
// }
//------------------------------------------------
// Count Frequency Of element
// import java.util.*;
// class day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr= new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int x=sc.nextInt();
//         int count=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==x){
//                 count++;
//             }
//         }
//         System.out.print(count);
//     }
// }