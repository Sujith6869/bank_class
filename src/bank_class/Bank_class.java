/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_class;

/**
 *
 * @author Win0
 */
public class Bank_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        bank icici=new bank();
        icici.bank_name="ICICI BANK";
        icici.interest=7;
        icici.display_interest();
        
        bank iob=new bank();
        iob.bank_name="IOB BANK";
        iob.interest=8;
        iob.display_interest();
        
        bank sbi=new bank();
        sbi.bank_name="SBI BANK";
        sbi.interest=9;
        sbi.display_interest();
    }
    
}
