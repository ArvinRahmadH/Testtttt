public class Items {

    private String nama;
    private double harga;

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Items (String nama, double harga){
        setNama(nama);
        setHarga(harga);
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString(){
        return nama + " "+harga;
    }


}
