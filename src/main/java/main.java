import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class main {
    private String id;
    private int score;

     public static void main (String[] args){
         try{
             FileInputStream serviceAccount = new FileInputStream("src/main/FirebaseKey/key.json");
             FirebaseOptions options = FirebaseOptions.builder().setCredentials(GoogleCredentials
                     .fromStream(serviceAccount))
                     .setDatabaseUrl("https://number-guessing-game-1b8d0-default-rtdb.europe-west1.firebasedatabase.app/")
                     .build();
             FirebaseApp.initializeApp(options);
             FirebaseDatabase database = FirebaseDatabase.getInstance();
             DatabaseReference ref = database.getReference("message");
             ref.setValue("This is a message", new DatabaseReference.CompletionListener() {
                 @Override
                 public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                     if (databaseError!=null){
                         System.out.println("Data could not be saved" + databaseError.getMessage());
                     }else{
                         System.out.println("Data Saved Successfully");
                     }
                 }
             });
         } catch (IOException e){
             e.printStackTrace();
         }
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
