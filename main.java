public class main {
    public static void main(String[] args) {
        main main1 = new main();
        main1.Swallowing_produkCategoris();
    }

    public void Swallowing_produkCategoris() {
        Produk produk = new Produk("12322", "300000", "Baju", "30%");
        Categories baju = new Categories("12322", "gamis");
        Categories jualan = new Categories("827265", "gamis");

        System.out.println(jualan);
        System.out.println(baju);
    }
}