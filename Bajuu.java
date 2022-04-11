package Eriigo;
import java.util.Scanner;

class Baju {
    String jenis;
    int harga;
    int jumlah;
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    private void hargaa() {
        if (jumlah >= 100){
            harga = 95000;
        } else {
            harga = bajua;
        }
    }

    private void hargab() {
        if (jumlah >= 100){
            harga = 120000;
        } else {
            harga = bajub;
        }
    }

    private void hargac() {
        if (jumlah >= 100){
            harga = 160000;
        } else {
            harga = bajuc;
        }
    }

    public void display() {
        if (jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);

    }
}
public class Bajuu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int bajua = 100000;
        final int bajub = 125000;
        final int bajuc = 175000;

        Baju erigo = new Baju();
        System.out.println("Selamat Datang di Erigo Store");
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajua);
        System.out.println("Baju B dengan harga " + bajub);
        System.out.println("Baju C dengan harga " + bajuc);
        System.out.print("Baju yang akan anda beli bertipe : ");
        erigo.jenis = scan.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        erigo.jumlah = scan.nextInt();
        erigo.display();

    }
}
