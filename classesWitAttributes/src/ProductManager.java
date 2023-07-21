public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("Ürün Eklendi. "+product.getName());
    }

    //yanlış kod yazımı
   /* public void Add2(int id, String name, String description, int stackAmount, double price, String yeniOzellik){ }*/
}
