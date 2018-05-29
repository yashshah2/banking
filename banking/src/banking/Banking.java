package banking;
import java.util.*;
class operation
{
    Scanner inp=new Scanner(System.in);
    String name;
    int accno;
    int bal;
    void create()
    {
        
        System.out.println("Enter the account no::");
        accno=inp.nextInt();
        System.out.println("Enter the name of the account holder::");
        name=inp.next();
        
        
    }
    void display()
    {
       System.out.println("Name::"+name+"\nAccount no::"+accno);
    }
    boolean search(int no)
    {
        display();
        if(accno==no)
        {
            return(true);
        }
        return false;
    }
    void deposit()
    {
        int amt;
        System.out.println("Enter the amount to deposit::");
        amt=inp.nextInt();
        bal=bal+amt;
    }
    void withdraw()
    {
        int amt;
        System.out.println("Enter the amount to withdraw::");
        amt=inp.nextInt();
        if(bal>amt)
            bal=bal-amt;
        else
            System.out.println("Insufficient balance::");
    }
}
public class Banking
{
    public static void main(String[] args)
    {
        int ch,i,no;
        Scanner inp=new Scanner(System.in);
        String name;
        int n,bal=0;
        int a[]=new int[10];
            operation[] obj=new operation[4];
        for(i=0;i<obj.length;i++)
        {
            obj[i]=new operation();
            obj[i].create();
        }
   
      
        n=0;
        do
        {
            System.out.println("Enter 1.Add account\n2.Deposit money\n3.Withdraw money\n4.Transfer money into other account\n5.Total amount of money in the bank\n6.Richest person in the bank.");
            ch=inp.nextInt();
            switch(ch)
            {
                case 1:
                    for(i=0;i<obj.length;i++)
                    {
                        obj[i].display();
                    }
                case 2:System.out.println("Enter the account no::");
                        no=inp.nextInt();
                        boolean found=false;
                        for(i=0;i<obj.length;i++)
                        {
                            found=obj[i].search(no);
                        }
                        if(found)
                        {
                            obj[i].deposit();
                        }
                        else
                            System.out.println("Account doesnot exist");
                case 3:System.out.println("Enter the account no::");
                        no=inp.nextInt();
                        boolean found1=false;
                        for(i=0;i<obj.length;i++)
                        {
                            found1=obj[i].search(no);
                        }
                        if(found1)
                        {
                            obj[i].withdraw();
                        }
                        else
                            System.out.println("Account doesnot exist");
                      
                        
                        
            }
        }while(ch!=4);
    }
    
}
