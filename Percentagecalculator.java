{
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
                break;
            }

            if ( marks <0 || marks >100){
                System.out.println("invalid marks entered");
                break;
            }
            sum+=marks;
        }
        int totalmarks=subjects*100;
        double percentage=sum/(double)totalmarks*100;
        String grade="";
        String Remarks="";
        if(percentage>=90){
            grade="A+";
            Remarks="keep it up champ";
        }
        else if(percentage>=80){
            grade="A";
            Remarks="keep it up champ";
        }
        else if (percentage>=70){
            grade="B";
            Remarks="Nice work";
        } else if (percentage>=60) {
            grade="C";
            Remarks="you have potential to achieve more than this";
        } else if (percentage>=50) {
            grade="D";
            Remarks="you have potential to achieve more than this";
        } else if (percentage>=40) {
            grade="E";
            Remarks="Need improvement";
        } else{
            grade="Fail";
            Remarks="Better luck next time";
        }
        System.out.println("percentage= " + percentage);
        System.out.println("Your grade is " + grade );
        System.out.printf(Remarks);
    }
}
