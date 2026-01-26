// class day2{
//     public static void main(String[] args){
//         int a=5;
//         int b=6;
//         System.out.println("Sum="+(a+b));
//         System.out.println("Product="+(a*b));
//     }
// }
//------------------------------------------------
// class day2{
//     public static void main(String[] args){
//         int cel = 25;
//         int cal=(cel*9/5)+32;
//         System.out.println(cal);
//     }
// }
//----------------------------------------------------
// class day2{
//     public static void main(String[] args){
//         // for(int i=0;i<5;i++){
//         //     System.out.println("Hello");
//         // }
//         // for(int i=1;i<=5;i++){
//         //     System.out.print(i);
//         // }
//         // int i=0;
//         // while(i<5){
//         //     System.out.println("Hello");
//         //     i++;
//         // }
//         // for(int i=0;i<=20;i=i+2){
//         //     System.out.println(i);
//         // }
//         // for(int i=1;i<=10;i++){
//         //     int ans=5*i;
//         //     System.out.println("5 * "+i+"="+ans);
//         // }
//     //     int sum=0;
//     //     for(int i=1;i<=10;i++){
//     //         sum=sum+i;
//     //     }
//     //     System.out.println(sum);
//     // }
//     // for(int i=10;i>=1;i--){
//     //     System.out.print(i+" ");
//     // }
//     // for(int i=20;i>=2;i=i-2){
//     //     System.out.print(i+" ");
//     // }
//     // int sum=0;
//     // for(int i=2;i<=10;i=i+2){
//     //     sum=sum+i;
//     // }
//     // System.out.println(sum);
//     }
// }
//----------------------------------------------------
//pattern printing
// class day2{
//     public static void main(String[] args){
        // normal 
    //        for(int i=1;i<=3;i++){
    //     for(int j=1;j<=5;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //right triangle
    // for(int i=0;i<5;i++){
    //     for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //inverted right triangle
    // for(int i=5;i>=1;i--){
    //     for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // //right triangle of number
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
//     }
// }
//--------------------------------------------------
//Pallindrome
// class day2{
//     public static void main(String[] args){
//         int num=121;
//         int og=num;
//         int rev=0;
//         while(num>0){
//             int digit=num%10;
//             rev=rev*10+digit;
//             num=num/10;
//         }
//         if(og==rev){
//             System.out.println("P");
//         }
//         else{
//             System.out.println("NP");
//         }
//     }
// }
//------------------------------------------------
//Armstrong
// class day2{
//     public static void main(String[] args){
//         int num=153;
//         int og=num;
//         int cub;
//         int sum=0;
//         while(num>0){
//             int digit = num%10;
//             cub=digit*digit*digit;
//             sum=sum+cub;
//             num=num/10;
//         }
//         if(og==sum){
//             System.out.println("A");
//         }
//         else{
//             System.out.println("NA");
//         }
//     }
// }
//-----------------------------------------------------
//Reverse
// class day2{
//     public static void main(String[] args){
//         int num=1234;
//         int rev=0;
//         while(num>0){
//             int digit=num%10;
//             rev=rev*10+digit;
//             num=num/10;
//         }
//         System.out.print(rev);
//     }
// }
//-------------------------------------------------
//Prime Number
// class day2{
//     public static void main(String[] args){
//         int num=5;
//         boolean divided=false;
//         for(int i=2;i<num;i++){
//             if(num%i==0){
//                 divided=true;
//                 break;
//             }
//         }
//         if(divided==true){
//             System.out.println("NPN");
//         }else{
//             System.out.println("Pn");
//         }
//     }
// }
//--------------------------------------------------
//Count Digits
// class day2{
//     public static void main(String[] args){
//          int num=789065;
//         int count=0;
//         while(num>0){
//             int digit=num%10;
//             count++;
//             num=num/10;
//         }
//         System.out.println(count);
//     }
// }
//----------------------------------------------------
// //Factorial
// class day2{
//     public static void main(String[] args){
//         int num=4;
//         int ans=1;
//         for(int i=num;i>=1;i--){
//             ans=ans*i;
//         }
//         System.out.println(ans);
//     }
// }
//-----------------------------------------------
//Fibbonicci Series
// class day2{
//     public static void main(String[] args){
//         int a=0;
//         int b=1;
//         System.out.print(a+" "+b+" ");
//         for(int i=3;i<=7;i++){
//             int c=a+b;
//             System.out.print(c+" ");
//             a=b;
//             b=c;
//         }
//     }
// }
//------------------------------------------
//Print All Factors of a Number
// class day2{
//     public static void main(String[] args){
//         int num=22;
//         for(int i=1;i<=num;i++){
//             if(num%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }
//--------------------------------------------
//Strong Number(Strong = sum of factorial of digits)
// class day2{
//     public static void main(String[] args){
//         int num=145;
//         int sum=0;
//         while(num>0){
//             int digit=num%10;
//             int ans=1;
//             for(int i=digit;i>=1;i--){
//                 ans=ans*i;
//             }
//             sum=sum+ans;
//             num=num/10;
//         }
//         System.out.println(sum);
//     }
// }
