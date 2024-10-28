import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cart cart = new Cart();
        int pilihan ;
//tes

        do{

            System.out.println(" selamat datang di toko online");
            System.out.println(" 1. pilih barang  ");
            System.out.println("2. lihat keranjang  ");
            System.out.println("3. checkout");
            System.out.println("4. keluar ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println(" masukkan nama items = ");
                    String nama = input.next();
                    System.out.println(" masukkan harga items = ");
                    double harga = input.nextDouble();
                    // ini adalah kelas yang menghubungkan inputan ke dalam setter getter
                    Items items1 = new Items(nama,harga);
                    cart.addItem(items1);
                    break;
                case 2 :
                    cart.ViewCart();
                    break;
                case 3 :
                    cart.Checkout();
                    break;
                case 4:
                    System.out.println(" keluarrr");
                    break;
                default:
                    System.out.println(" inputan anda lebih dari 4");
            }

        }while (pilihan!=4);
    }
}
