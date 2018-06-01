/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

/**
     * This function is used to create the account.
     * Asks for the name and account no to the user.
     *  This function is used to display the name and account no after the creation.
     * after verifying the account number it asks the user , the amount that is to be deposited
     * The balance is updated and printed
     *after verifying the account number it asks the user , the amount that is to be withdrawn
     * The balance is updated and printed
     */
public class Operation
{
    Scanner inp=new Scanner(System.in);
    String name;
    int account_no;
    int balance;
    
    public void create(int accno,String name)
    {
        System.out.println("Enter the account no::");
        account_no=inp.nextInt();
        System.out.println("Enter the name of the account holder::");
        name=inp.next();
    }
 
    public void display()
    {
       System.out.println("Name::"+name+"\nAccount no::"+account_no);
    }
   
    public int deposit(int accno,int amt,int balance)
    {
        balance=balance+amt;
        //System.out.println("balance="+balance);
        return balance;
    }
    
    public int withdraw(int accno,int amt,int balance)
    {
        
        
        if(balance>amt)
            balance=balance-amt;
        else
            System.out.println("Insufficient balance::");
        return balance;
    }
}