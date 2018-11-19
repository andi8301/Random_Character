package random_character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Random_Character {
    
       public static int Inputan(){
             Scanner inputan = new Scanner(System.in);
             System.out.print("masukan length: ");
             int in = inputan.nextInt();
             return in;
    }

    public static void main(String[] args) {
        String [] Alphanumeric = new String []  {"1","2","3","4","5","6","7","8","9","0",
                                                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                                                "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
                                                 };  
        List<String> strList = Arrays.asList(Alphanumeric);
        Boolean ulangi = false;
        int x = Inputan();
            if (x <= 62){
                for(int i = 0; i < 62; i++){
                strList.contains(i+1);
                }
        
                Collections.shuffle(strList);
                System.out.print("Random Character : ");
                
                for(int j =0; j < x; j++){
                System.out.print(strList.get(j) + " ");
                }
            }else {
                 System.err.println("Maksimal Inputan 62");
            }
        }
    }

       

