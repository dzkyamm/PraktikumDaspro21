package week6; 
import java.util.Scanner; 

public class Task1BookstoreDiscount21 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter day: "); 
        String day = sc.nextLine().trim(); 
        System.out.print("Enter book type (dictionary / novel / other): "); 
        String type = sc.nextLine().trim(); 
        System.out.print("Enter total books / quantity: "); 
        int qty = sc.nextInt(); 
        System.out.print("Enter price per book: "); 
        double price = sc.nextDouble(); 
        
        double totalPrice = qty * price; 
        double discount = 0; 
        
        if (day.equalsIgnoreCase("Wednesday")) { 
            if (type.equalsIgnoreCase("dictionary")) { 
                if (qty > 2) { 
                    discount = 12; 
                } else { 
                    discount = 10; 
                } 
            } else if (type.equalsIgnoreCase("novel")) { 
                if (qty > 3) { 
                    discount = 9; 
                } else { 
                    discount = 5; 
                } 
            } else { 
                discount = 5; 
            } 
        } else { 
            discount = 0; 
        } 
        
        double discountTotal = totalPrice * (discount / 100); 
        double payTotal = totalPrice - discountTotal; 
        
        System.out.println("Discount total: " + discountTotal); 
        System.out.println("Pay total: " + payTotal); 
        sc.close(); 
    } 
}