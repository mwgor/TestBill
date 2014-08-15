/* Michael Gor   7/9/2014
 *
TestBill.java to test Bill and ServiceBill class
 Create a Bill object with “John Smith ”
 Use set methods to put in sales: $80, and tax rate: 8.5%
 Create another Bill object with name: “John Smith”, sales: $200 and tax rate: 6%
 Create a ServiceBill object with “Jane Smith” with sales = $60, tax rate= 8.5%, tip =$12
 Put all three objects in an array, process the bills polymorphically (See example Fig 10.9) to print the bills and total charge.
 *
 */

package testbill;

/**
 *
 * @author Michael
 */
public class TestBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SalesBill bill, anotherBill;
        ServiceBill serviceBillx;
        
        double grandTotal=0;
        
        bill = new SalesBill( "John Smith");
        bill.setSales(80.0);
        bill.setTaxRate(8.5); // in percent
         
        anotherBill = new SalesBill("John Smith", 200.0, 6.0);
        
        serviceBillx = new ServiceBill("Jane Smith", 60.0 , 8.5, 12);
        
        // Create array for polymorphic processing
        SalesBill[] salesBills = new SalesBill[3];
        
        salesBills [0] = bill;
        salesBills [1] = anotherBill;
        salesBills [2] = serviceBillx ;
        
        for(int i=0; i< 3; i++) //SalesBill currentSalesBill : salesBills)
        {
         
            
         //System.out.printf("\nBill is %s", salesBills[i].getClass().getName());
         System.out.println( salesBills[i]); // invokes toString
        
         grandTotal += salesBills[i].getCharge();
            
        } // end For
        
        System.out.printf("\nGrand total charge: %.2f\n", grandTotal);
        
    } // end Main
    
}
