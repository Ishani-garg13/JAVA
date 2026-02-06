package arrays;
import java.util.Scanner;


public class Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1st way
//		int[] arr=new int[5];
////		String[] name=new String[5];
////		System.out.println(arr[1]);
////		System.out.println(name[1]);
////		//2nd way
////		int[] arr1= {1,2,3,4,5};
////		System.out.println(arr1[1]);
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
//		int count=1;
//		//arr[5]=6;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=2*count;
//			count++;
//			System.out.println(arr[i]);
//		}
//		//for each or enhanced for loop
//		for(int e:arr) {
//			System.out.println(e);
//		}
//		
		
//		int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
//		int sum=0;
//		float avg=0;
//		for(int i=0;i<numbers.length;i++) {
//			sum=sum+numbers[i];
//		}
//		avg=sum/numbers.length;
//		System.out.println(sum+" "+avg);
		

//		class Student {
//		    private int rollno;
//		    private String name;
//
//		    public Student(int roll, String name) {
//		        this.rollno = roll;
//		        this.name = name;
//		    }
//
//		    void print() {
//		        System.out.println("RollNo: " + rollno + "\nName: " + name);
//		    }
//		}
//
//		public class Demo {
//		    public static void main(String[] args) {
//
//		        Scanner sc = new Scanner(System.in);
//
//		        System.out.println("Enter n:");
//		        int n = sc.nextInt();
//		        sc.nextLine(); // clear buffer
//
//		        Student[] students = new Student[n];
//
//		        for (int i = 0; i < n; i++) {
//		            System.out.println("Enter roll no:");
//		            int rollno = sc.nextInt();
//		            sc.nextLine();
//
//		            System.out.println("Enter name:");
//		            String name = sc.nextLine();
//
//		            students[i] = new Student(rollno, name);
//		        }
//
//		        for (Student s : students) {
//		            s.print();
//		        }
//
//		        sc.close();
//      Scanner sc = new Scanner(System.in);
//      int [][] array = new int[3][3];  
//      System.out.println("ENter the no:");
//      for(int i=0;i<array.length;i++) {
//    	  for(int j=0;j<array[i].length;j++) {
//    		  array[i][j]=sc.nextInt();
//		    }
//		}
//      for(int i=0;i<array.length;i++) {
//    	  for(int j=0;j<array[i].length;j++) {
//    		  System.out.print(array[i][j]+" ");
//    	  }
//          System.out.println();
//      }