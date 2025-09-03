import java.util.Scanner;

class Product
{
    String productName = "";
    int productCode = 0;

    public Product()
    {
        this.productName = "codetree";
        this.productCode = 50;
    }

    public Product(String productName, int productCode)
    {
        this.productName = productName;
        this.productCode = productCode;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
    
        Product firstProduct = new Product();
        Product secondProduct = new Product(id2, code2);

        System.out.println("product " + firstProduct.productCode + " is " + firstProduct.productName);
        System.out.println("product " + secondProduct.productCode + " is " + secondProduct.productName);
    }
}