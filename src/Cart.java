
import java.util.ArrayList;
public class Cart implements Keranjang {

    private final ArrayList<Items>items;


    public Cart (){
        items = new ArrayList<>();
    }

    @Override
    public void addItem(Items item){
        items.add(item);
        System.out.println(item.getNama()+ " barang telah ditambah");
    }

    @Override
    public void ViewCart(){
        if (items.isEmpty()){
            System.out.println(" barang anda kosong");

        }else{
            System.out.println(" barang anda di keranjang adalah");
            for(Items item : items){
                System.out.println("barang anda "+ item);
            }
        }
    }

    public double getTotharga() {
        double total = Calculated();
        for (Items items1 : items) {
            total += items1.getHarga();
        }return total;
    }

    private static double Calculated() {
        return 0;
    }

    public void Checkout(){


        if (items.isEmpty()){
            System.out.println(" anda belum menambah apapun di keranjang");
        }
        else {
            double totalH = getTotharga();
            int i = 1;
            System.out.println(" baran berhasil di checout dengan nama : ");
            for (Items itemsN : items){
                    System.out.println(i + itemsN.getNama() + " Harga = " + itemsN.getHarga());
            i++; }
                System.out.println(" dengan total harga "+ totalH);
                items.clear();
                System.out.println(" terima kasih");
        }
    }
}
