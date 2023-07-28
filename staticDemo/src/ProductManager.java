public class ProductManager {
    public void add(Product product){

        if (ProductValidator.isValid(product)){
            System.out.println("Ürün Bilgileri Eklendi");
        }else {
            System.out.println("Ürün Bilgileri Eklenemedi.");
        }

        ProductValidator validator = new ProductValidator();
        validator.bisey();

    }
}
