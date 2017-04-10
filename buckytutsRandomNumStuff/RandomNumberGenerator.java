package buckytutsRandomNumStuff;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author rawhitta
 */
public class RandomNumberGenerator {
    public static void main(String [] args){
        Random dice = new Random();
        int number;
        
        for (int counter = 1; counter <=10; counter++)
        {
            number = dice.nextInt(6) + 1;
            System.out.println(number);
        }
    }
}
