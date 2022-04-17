

package tugaspraktikum3;


public class Baju {
    String jenis;
    int harga;
    int jumlah;
    
    Baju(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }
    private final int bajuA = 100000;
    private final int bajuB = 125000;
    private final int bajuC = 175000;
    
    public void hargaA () {
        if (jumlah > 100) {
            harga = 95000;
        } else {
            harga = bajuA;
        }
    }
    public void hargaB () {
        if (jumlah > 100) {
            harga = 120000;
        } else {
            harga = bajuB;
        }
    }
    public void hargaC () {
        if (jumlah > 100) {
            harga = 160000;
        } else {
            harga = bajuC;
        }
    }
    
    public void display () {
        if (jenis.equalsIgnoreCase("a")) { 
            hargaA();
        } else if (jenis.equalsIgnoreCase("b")) { 
            hargaB();
        } else if (jenis.equalsIgnoreCase("c")) { 
            hargaC();
        }
        
        System.out.println("Jenis yang anda beli \t : " + jenis);
        System.out.println("Harga per buah  \t : " + harga);
        System.out.println("Total harga     \t : " + (harga*jumlah));
    }
}
