import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<Product> productList;
    private ArrayList<Product> saleList;

    public List() {
        productList=new ArrayList<Product>();
        saleList=new ArrayList<Product>();
    }

    //Product List
    public void addProduct(Product p){
        productList.add(p);
    }

    public void deleteProduct(Product p){
        productList.remove(p);
    }

    public String seeAllProducts(){
        String answer="";
        for (Product a:productList){
            answer+=a.toString();
        }
        return answer;
    }

    public void modifyProduct(Product a){
        Scanner sc=new Scanner(System.in);
       String code;
       String name;
       String description;
       double salePrice;
       double purchasePrice;
       int stock;
        for (Product b:productList){
            if (b.getCode().equalsIgnoreCase(a.getCode())){
                System.out.println("Ingrese el codigo del producto:");
                code=sc.nextLine();
                b.setCode(code);
                System.out.println("Ingrese el nombre del producto");
                name=sc.nextLine();
                b.setName(name);
                System.out.println("Ingrese la descripcio denl producto");
                description=sc.nextLine();
                b.setDescription(description);
                System.out.println("Ingrese el stock del producto");
                stock= sc.nextInt();
                b.setStock(stock);
                System.out.println("Ingrese el precio de compra");
                purchasePrice= sc.nextDouble();
                b.setPurchasePrice(purchasePrice);
                System.out.println("Ingrese el precio de venta");
                salePrice=sc.nextDouble();;
                b.setSalePrice(salePrice);
            }
        }
    }

    //Sell List

    public void saleOfProduct(Product a){
        saleList.add(a);
        productList.remove(a);
    }



}
