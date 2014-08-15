/*
Write a subclass ServiceBill.java with the following,
 ServiceBill is a subclass of class SalesBill
 Instance variable:
o Tip: amount of tip customer gives
 4-argument constructor
 Other standard and useful methods
===========================================
  ServiceBill
____________________
-tip :double
___________________
+ServiceBill ( String customerName1, double sales1, double taxRate1, double tip)
+getTip(): double
+setTip(double top1)
+toString()

 *
 */

package testbill;

/**
 *
 * @author Michael
 */
public class ServiceBill extends SalesBill {
    private double tip;
    
    public ServiceBill(String customerName1, double sales1, double taxRate1,double tip1)
    {
     super( customerName1, sales1, taxRate1);
     tip = tip1;
    }
    
    public double getTip()
    {
      return this.tip;
    }
    public void setTip(double tip1)
    {
      tip = (tip1 >=0 ) ? tip1 : 0;        
    }
    
    public double getCharge()
 {
   return (getSales() *getTaxRate() + getSales() + this.getTip());
 }
    
    public String toString()
    {
      
      return String.format(
          "\nCustomer Name: %s\nSales: %.2f    Tax Rate: %.4f   Tip: %.2f  Total Charges: $%.2f", 
                         this.getCustomerName(), this.getSales(), this.getTaxRate(), this.getTip(),
                          getCharge());
    }
            
    
}
