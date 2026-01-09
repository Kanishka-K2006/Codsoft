import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] marks=new int[5];
        int total=0;
        System.out.println("Enter marks for 5 subjects(out of 100):");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        double percentage;
        percentage=total/5.0;
        String grade;
        if(percentage>=95)
            grade="O";
        else if(percentage>=85)
            grade="A+";
        else if(percentage>=75)
            grade="A";
        else if(percentage>=65)
            grade="B";
        else if(percentage>=55)
            grade="C";
        else
            grade="Fail";
        System.out.println("Total marks:"+total);
        System.out.println("Average Percentage:"+percentage);
        System.out.println("Grade:"+grade);
        sc.close();
    }
    
}