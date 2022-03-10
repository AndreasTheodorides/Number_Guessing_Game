import java.util.Objects;
import java.util.Scanner;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class main {
    private String id;
    private int score;

     public static void main (String[] args){
         System.out.println("Hello, Welcome to Simple Calculator");
         String input1 = getInput("Is it your first game?(y/n) ");
     }

    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void firstGame(String input1){
         if(Objects.equals(input1, "y")){
             //something
         }else{
             //something
         }
    }

}
