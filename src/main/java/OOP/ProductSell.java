package OOP;
//ex of parameterised constructor

public class ProductSell {
    public int vat; // VAT PROPERTY OF A CLASS

    public ProductSell(int vat){ // create a method of class with same name having one parameter
        this.vat=vat;  //value from vat parameter will e loaded straight to vat properties when productsell constructor is called
    }
    public int getPrice(int price){
        price=price+(price*vat/100);
        return price;
    }
    public static void main(String[] args) {
        ProductSell shirt=new ProductSell(15);
        int totalPrice= shirt.getPrice(100);
        System.out.println(totalPrice);

        ProductSell pizza=new ProductSell(7);
        totalPrice= pizza.getPrice(700);
        System.out.println(totalPrice);
    }

}
