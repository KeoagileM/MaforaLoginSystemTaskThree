/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 * @author Keoagile Mafora (ST10457036)
 */
public class MaforaLoginSystemTaskThree {
    public static void main(String[] args) {
        
        //This is for the Username Input
        String userName;
        
        do{
            userName = JOptionPane.showInputDialog(null,"Enter a username (up to 5 characters, must contain an underscore)","Username Validation",JOptionPane.QUESTION_MESSAGE);
        }while (checkUserName(userName));
        
        JOptionPane.showMessageDialog(null, "Welcome " + userName, "Thank You", JOptionPane.INFORMATION_MESSAGE);
    
        //This is for Password Input
        String password;
        
        do {
            password = JOptionPane.showInputDialog(null, "Enter a password (at least 8 characters, must contain a capital letter, a number, and a special character)", "Password Validation", JOptionPane.QUESTION_MESSAGE);
        } while (!checkPasswordComplexity(password));
        
        JOptionPane.showMessageDialog(null, "You have completed your registration", "REGISTRATION", JOptionPane.INFORMATION_MESSAGE);
        
        //For login to the account using the same username and password.
       boolean status = false;
       
           String correctUsername = JOptionPane.showInputDialog("Enter your Username");
           String correctPassword = JOptionPane.showInputDialog("Enter your Password");
         do {  
        if (correctUsername.equals(userName) && correctPassword.equals(password)){
            JOptionPane.showMessageDialog(null, "Welcome back " + userName);
            status = true;
        }else {
           correctUsername = JOptionPane.showInputDialog("Enter your Username");
           correctPassword = JOptionPane.showInputDialog("Enter your Password");
           
           
        }
        
        }while (status == false);
       
         //Method to check if the password has special characters, 8 words, and numbers
    }
        public static boolean checkPasswordComplexity(final String password) {
            if (password.length() < 8) {
                return false;
            }
            
            boolean hasCapitalLetter = false;
            boolean hasNumber = false;
            boolean hasSpecialCharacter = false;
            
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if(Character.isUpperCase(c)) {
                    hasCapitalLetter =true;
                } else if (Character.isDigit(c)) {
                    hasNumber = true;
                }else if (isSpecialCharacter(c)) {
                    hasSpecialCharacter = true;
                }
            }
            
            return hasCapitalLetter && hasNumber && hasSpecialCharacter;
        }
         
        //A ,ethod to check the username if it has less than 5 letters and has an underscore

       private static boolean checkUserName(String userName) {
         if (userName.contains("_") && userName.length() <= 5) {
             return false;
        }
        return true;
       }
       
       //To enter special characters
       private static boolean isSpecialCharacter(char c) {
           String specialCharacters = "~!@#$%^&*_+{}:<>.,';][=-`";
           return specialCharacters.indexOf(c) != -1 ;
       }
       
      
       
       

}