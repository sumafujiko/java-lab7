//Create an application that generates an array of 5 random numbers 1-10. The user should then guess a number and the app will tell them how many time that number exists within the array.
//Neil McCarthy - x23319828
import javax.swing.JOptionPane;
public class Guessnumber {
    public static void main(String[] args){
        //Create an array to store the random numbers
        int[] numbers = new int[5];
        //Create a variable to store the user's guess
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 1 and 10"));
        //Create a variable to count the number of times the guess appears in the array
        int count = 0;
        //Generate the random numbers
        for(int i=0; i<5; i++){
            numbers[i] = (int)(Math.random() * 10) + 1;
            if (numbers[i] == guess){
                count++;
            }
        }
        //Print the results + amount of times the number exists in the array
        JOptionPane.showMessageDialog(null, "The numbers are: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4]);
        if (count == 0){
            JOptionPane.showMessageDialog(null, "The number " + guess + " does not appear in the array");
        } else {
            JOptionPane.showMessageDialog(null, "The number " + guess + " appears " + count + " times in the array");
        }
    }
}