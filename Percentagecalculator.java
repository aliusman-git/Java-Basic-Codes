import java.util.Scanner;

public class Percentagecalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter number of subjects: ");
        int subjects=input.nextInt();
        for (int i=1;i<=subjects; i++){
            System.out.print("Enter marks of subject no " + i+": ");
            int marks= input.nextInt();
            if (marks<33){
                System.out.println("You are fail");
                return;
            }

            if ( marks <0 || marks >100){
                System.out.println("invalid marks entered");
                return;
            }
            sum+=marks;
        }
        int totalmarks=subjects*100;
        double percentage=sum/(double)totalmarks*100;
        String grade="";
        if(percentage>=90){
            grade="A+";
        }
        else if(percentage>=80){
            grade="A";
        }
        else if (percentage>=70){
            grade="B";
        } else if (percentage>=60) {
            grade="C";
        } else if (percentage>=50) {
            grade="D";
        } else if (percentage>=40) {
grade="E";
        } else{
            grade="Fail";
        }
        System.out.println("percentage= " + percentage);
        System.out.println("grade is " + grade);
    }
}
