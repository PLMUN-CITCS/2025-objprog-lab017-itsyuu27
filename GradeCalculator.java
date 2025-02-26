import java.util.Scanner;

public class GradeCalculator
{

    public static double getStudentScore()
    {
        Scanner input = new Scanner(System.in);
        double studentScore;
        do
        {
            System.out.println("Enter your score: ");
            studentScore = input.nextDouble();

            if(studentScore > 100 || studentScore < 0)
            {
                System.out.print("Invalid input: Grade must be 0 to 100 only");
            }

        }while(studentScore > 100 || studentScore < 0);

        return studentScore; 
    }

    public static String calculateGrade(double studentScore)
    {
        String letterGrade;

        if(studentScore < 60)
        {
            letterGrade = "F";
        }
        else if(studentScore <= 69)
        {
            letterGrade = "D";
        }
        else if(studentScore <= 79)
        {
            letterGrade = "C";
        }
        else if(studentScore <= 89)
        {
            letterGrade = "B";
        }
        else
        {
            letterGrade = "A";
        }

        return letterGrade;
    }

    public static void main(String[] args) 
    {
        String letterGrade = calculateGrade(getStudentScore());

        System.out.println("Your Grade is: " + letterGrade);
        
        
    }
}
