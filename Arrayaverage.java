//Create an application that asks a user to enter how many subjects they have. The application should then ask the user to enter the results for each subject. Store these results in an array and print them back to the user along with their overall average and grade for each module.
//Neil McCarthy - x23319828
import javax.swing.JOptionPane;
public class Arrayaverage {
    public static void main(String[] args){
        //Ask the user how many subjects they have
        int subjects = Integer.parseInt(JOptionPane.showInputDialog("How many subjects do you have?"));
        //Create an array to store the results
        int[] results = new int[subjects];
        //Create a variable to store the total
        int total = 0;
        //Ask the user to enter the results for each subject
        for(int i=0; i<subjects; i++){
            results[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the result for subject " + (i + 1)));
            total += results[i];
        }
        //Print the results along with the overall average of each module
        String output = "Results: ";
        for(int i=0; i<subjects; i++){
            output += "\nSubject " + (i + 1) + ": " + results[i];
        }
        output += "\nOverall average: " + (total / subjects);
        JOptionPane.showMessageDialog(null, output);
    }
}