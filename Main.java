
package tugaspraktikum3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        String jenis;
        int jumlah;
        
    System.out.println("Baju yang tersedia : ");
    System.out.println("Baju A dengan harga 100000");
    System.out.println("Baju B dengan harga 125000");
    System.out.println("Baju C dengan harga 175000");
    
    System.out.print("Baju yang akan anda beli bertipe : ");
     jenis = scan.nextLine();
    System.out.print("Jumlah Baju yang akan anda beli adalah : ");
     jumlah = scan.nextInt();
    
    Baju baju = new Baju(jenis, jumlah);
    baju.display();
    }
}
