package random_character;

import java.util.Scanner;

public class Random_Character {

    public static void main(String[] args) {
                  
          Scanner scanner = new Scanner (System.in);
//        System.out.println("Masukkan Ketentuan ketentuan 1 : ");
//        Integer a = scanner.nextInt();
//        System.out.println("Masukkan Ketentuan ketentuan 2 : ");
//        Integer b = scanner.nextInt();
//        System.out.println("Masukkan Ketentuan ketentuan 3 : ");
//        Integer m = scanner.nextInt();
        System.out.print("Masukkan berapa banyak karakter: ");   
        int input = scanner.nextInt();
        
        int a = 67, b = 90, m = 122;
        int[] Y_ = new int[1000];
        char[] temp = new char[1000];
        Y_[0] = 65;
        for (int i = 1; i < input +1; i++) {
            Y_[i] = (a * Y_[i - 1] + b) % m;
            if(Y_[i]>47 && Y_[i]<58 ||   // angka
               Y_[i]>64 && Y_[i]<91 ||  // huruf besar
               Y_[i]>96 && Y_[i]<123)   // huruf kecil
            {
                temp[i] = (char)Y_[i];
                System.out.print(temp[i]);
            }
            else {
              input++;
            }
            Y_[i-1]=Y_[i];
        }
    }
    
}
