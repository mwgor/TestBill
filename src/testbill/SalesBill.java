/* Michael GOr
 * 
SalesBill.java to implement a Bill class with the following components,
 Instance variable:
o customer name: string to indicate full name of the customer
o sales : total sales amount (before tax)
o tax rate: sales tax rate

 One argument constructor: takes customer name, calls the 3-argument constructor
 3-argument constructor
 Other standard and useful methods
=================================================
     SalesBill
___________________________
- customerName: string
- sales:        double
- taxRate:      double
___________________________
+SalesBill( String customerName1, double sales1, double taxRate)
+SalesBill( String customerName1)
+getCustomerName (): String
+getSales (): double
+getTaxRate(): double
+setCustomerName( String customerName1)
+setSales (double sales1)
+setTaxRate (double taxRate1)
+toString() 

 *
 */

package testbill;


public class SalesBill {
 private String customerName;
 private double sales;
 private double taxRate;
 private double charge;
 
 // CONSTRUCTORS
 public SalesBill( String customerName1, double sales1, double taxRate1 )
 {
     customerName = customerName1;
     sales        = sales1;
     taxRate      = taxRate1/100.0;
 }
 public SalesBill( String customerName1 )
 {
     this(customerName1, 0.0, 0.0);
 }  
 
 public String getCustomerName()
 {
     return customerName;
 }
 public void setCustomerName(String customerName1)
 {
     customerName = customerName1;
 }
 public double getSales()
 {
     return this.sales;
 }
 public void setSales(double sales1)
 {
     sales = sales1;
 }
 public double getTaxRate()
 {
     return taxRate;
 }
 public void setTaxRate( double taxRate1)
 {
     taxRate = taxRate1/100.0;
 }
 public double getCharge()
 {
   return getSales() * getTaxRate() + getSales();
 }
 
 @Override
 public String toString()
 {
    return String.format("\nCustomer Name: %s\nSales: %.2f    Tax Rate: %.4f     Total Charges: $%.2f", 
                         this.getCustomerName(), this.getSales(), this.getTaxRate(), 
                         getCharge() );
 }    
 
}
