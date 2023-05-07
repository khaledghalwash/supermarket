
package supermarket;
import java.util.GregorianCalendar;
class Invoice {

private Date date;
private String time;
private Product Sold_products [];
//private ArrayList <Product> Sold_products2;
private double Sold_product_price;
private double total_initial_price;
private static double total_final_price;
private int Staff_Member_Id;
private String POS_ID;
private static double Total_Amount_Invoices;

    public Invoice(){}
    
    public Invoice(Date date, String time, double Sold_product_price, double total_initial_price, double total_final_price, int Staff_Member_Id,String POS_ID) {
        this.date = date;
        this.time = time;
        this.Sold_product_price = Sold_product_price;
        this.total_initial_price = total_initial_price;
        this.total_final_price = total_final_price;
        this.Staff_Member_Id = Staff_Member_Id;
        this.POS_ID = POS_ID;
        
        Total_Amount_Invoices+=total_final_price;
    }
    
    public void setPOS_ID(String POS_ID) {
        this.POS_ID = POS_ID;
    }

    public String getPOS_ID() {
        return POS_ID;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setStaff_Member_Id(int Staff_Member_Id) {
        this.Staff_Member_Id = Staff_Member_Id;
    }

    public int getStaff_Member_Id() {
        return Staff_Member_Id;
    }
    
    public static double getTotal_Amount_Invoices() {
        return Total_Amount_Invoices;
    }

   /* public void addProducts(Product p){
     Sold_products2.add(p);
    }
*/
   
    public double calcFinalPrice(person p,Product c,int numOfItemC){
     
        if (p instanceof Client && c.discount==false){
            total_initial_price+=c.sellingP*numOfItemC;
            total_final_price=total_initial_price;
        } else if(p instanceof GoldenClient && c.discount==false)  {    
                //calculated method in Golden client
        }else if (p instanceof Client && c.discount==true){
           total_final_price=c.sellingP-0.1*c.sellingP;
        }           
        
        return total_final_price;
        
    }
        


class Private_Card{

private String CardId;
private String username;
private String Code;
private boolean POS;


    public Private_Card(){}
    public Private_Card(String CardId, String username, String Code) {
        this.CardId = CardId;
        this.username = username;
        this.Code = Code;
    }

    public void setCardId(String CardId) {
        this.CardId = CardId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getCardId() {
        return CardId;
    }

    public String getUsername() {
        return username;
    }

    public String getCode() {
        return Code;
    }

    public boolean isPOS() {
        return POS;
    }

    public void OpenPOS() {
     POS=true;
    } // I have an idea here about code and POS


}

class Date{}
class Product{
public boolean discount;
public double sellingP
 
}
class person{}
class Client extends person{}
class GoldenClient extends Client{}
class Staff_member{};

public class Supermarket {

   
    public static void main(String[] args) {
      
    }
    
}
