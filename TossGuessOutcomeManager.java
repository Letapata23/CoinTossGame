/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.util.Random;

/**
 *
 * @author gee
 */
public class TossGuessOutcomeManager {
    private String userToss;
    private String username;
    private String computerName;

    public TossGuessOutcomeManager(String userToss, String username, String computerName) {
        this.userToss = userToss;
        this.username = username;
        this.computerName = computerName;
    }
 
    public String generateComputerGuess(){
        String computerGuess = "";
        Random randNum = new Random();
        int num = randNum.nextInt(1-0+1);
        
        // Generate computer's guess
        switch(num){
            case 0:
                computerGuess = "Heads";
                break;
            case 1:
                computerGuess = "Tails";
                break;
        }
        
        return computerGuess;
    }
    
    public String determineOutcome(String compGuess){
        String outcome = "";
        
        // Call the determineComputerGuess()
        String computerGuess = compGuess;
        
        // Determine the outcome
        if(this.userToss.equalsIgnoreCase(computerGuess)){
            outcome = this.computerName + " has won.";
        }
        else{
            outcome  = this.username + " has won.";
        }
        return outcome;
    }
}
