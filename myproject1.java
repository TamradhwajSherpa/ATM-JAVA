import java.io.*;
import java.util.Scanner;

class jav2a {

}

class myproject1 {
    static Scanner sc = new Scanner(System.in);

    static void newAccount() {
        System.out.println("First name: ");
        String firstName = sc.nextLine();
        System.out.println("Last name: ");
        String lastName = sc.nextLine();
        System.out.println("Date of birth: ");
        int dob = sc.nextInt();
        System.out.println("Mobile no.: ");
        long mob = sc.nextLong();
        sc.nextLine(); // Consume newline
        System.out.println("Nation: ");
        String nation = sc.nextLine();
        System.out.println("Gender (1. Male, 2. Female): ");
        int gender = sc.nextInt();
        if (gender == 1) {
            System.out.println("Java");
        }
    }

    static void Deposite() {  // Deposit implementation
        System.out.println("Enter Your Card Detail");
        System.out.println("Enter Cardholer's name :");
        String name = sc.nextLine();
        System.out.println("Card number :");
        int cardno = sc.nextInt();
        for (int m = 1; m <= 5; m++) {
            System.out.println("Enter cvv :");
            int cvv = sc.nextInt();
            if (cvv <= 99 || cvv >= 999) {
                System.out.println("Enter correct cvv !");
            } else {
                System.out.print("Account No.:");
                int Accountno = sc.nextInt();
                System.out.println("Enter Case: ");
                int Ecase = sc.nextInt();
                System.out.println("please wait for transaction");
                try {
                    for (int i = 0; i < 5; i++) {

                        Thread.sleep(1000);

                        System.out.println(".");
                    }
                    {
                        System.out.println("your transaction complete");
                        System.out.println("Thanks for Deposit Money");
                    }
                } catch (Exception e) {

                    System.out.println(e);
                }
                break;
            }
        }

    }

    static void fastcase() {   // Fast cash implementation
        System.out.println("ATM Card No. : ");
        int atm = sc.nextInt();
        System.out.println("Pin No. :");
        int pin = sc.nextInt();
        if (pin == pin) {
            System.out.println("Balance Enter : ");
            int bal = sc.nextInt();
            System.out.println("Withdral Money ");
            System.out.println("1.Yes    2.No");
            int yes;
            yes = sc.nextInt();
            if (yes == 1) {
                try {
                    System.out.println("Please Wait ");
                    for (int i = 0; i < 5; i++) {

                        Thread.sleep(1000);

                        System.out.println(".");
                    }
                    {
                        System.out.println("Please Get Money **");
                    }
                } catch (Exception e) {

                    System.out.println(e);
                }
            } else {
                System.out.println("Wrong password .");
            }
        }
    }

    public static void transfer() {
        // Transfer implementation
        System.out.println("ACCOUNT DETAILS :");
        System.out.println();
        System.out.print("Your Name : ");
        String na = sc.nextLine();
        System.out.print("Account No. : ");
        int account = sc.nextInt();
        System.out.print("Date Of Birth : ");
        int yyyy = sc.nextInt();
        System.out.print("Enter IFSC Code : ");
        int ifsc = sc.nextInt();
        System.out.print("Enter Your Password : ");
        int password = sc.nextInt();
        try {
            System.out.println();
            System.out.println("PLEASE WAIT ");
            for (int i = 0; i < 4; i++) {

                Thread.sleep(1000);

                System.out.println(".");
            }
            {
                System.out.println("THANKS ....!");
                System.out.println();
            }
            {
                System.out.println("Accept Your All Requst **");
                System.out.println();
            }
        } catch (Exception e) {

            System.out.println(e);
        }
        System.out.println("ENTER CLINT DETAIL ^^^^");
        System.out.println();
        System.out.print("Enter Account No. : ");
        int ad = sc.nextInt();
        System.out.print("Date Of Birth : ");
        int dobi = sc.nextInt();
        System.out.print("AREA PIN Code : ");
        int pin = sc.nextInt();
        System.out.print("Enter Amount For Transfer : ");
        int Amount = sc.nextInt();
        try {
            System.out.println("Thanks For Use ME ");
            System.out.println();
            System.out.println("Please Wait ");
            for (int i = 0; i < 5; i++) {

                Thread.sleep(1000);

                System.out.println(".");
            }
            {
                System.out.println("Transaction complete .....!");
            }
            {
                System.out.println("Accept Your All Request **");
            }
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void cashwithdrawal() {
        // Cash withdrawal implementation
        System.out.println("Insert Your ATM card : ");
        System.out.println("1.yes   2.No");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("OK....");
            System.out.print("Enter ATM Card no. : ");
            int at = sc.nextInt();
            System.out.print("Enter 4 digit pin : ");
            int pin = sc.nextInt();
            System.out.println("Withdrawl Money Enter 1.");
            int a = sc.nextInt();
            a = 1;
            if (a == 1) {
                System.out.println("Enter your Amount : ");
                int amount = sc.nextInt();
                try {
                    System.out.println("Please Wait a second ....");
                    System.out.println("Transection begin");
                    for (int i = 1; i <= 5; i++) {
                        Thread.sleep(600);
                        System.out.println(".");
                    }
                } catch (Exception e) {
                    System.out.println(a);
                }
                System.out.println("recived your money");
                System.out.println("Your Transection Complete ...");
            }

        } else {
            System.out.println("error");
        }

    }
}

class java12 {
    public static void main(String[] args) {

        System.out.println("You have no any account please  create account for enter   1.");
        System.out.println("You have already account  2. ");
        Scanner sc = new Scanner(System.in);
        int newac = sc.nextInt();
        newac = 1;
        if (newac == 1) {
            System.out.println("First name : ");
            String nam = sc.nextLine();
            System.out.println("Last name : ");
            String lastn = sc.nextLine();
            System.out.println("Date of birth : ");
            int dob = sc.nextInt();
            System.out.println("Mobile no. : ");
            int mob = sc.nextInt();
            System.out.println("Nation : ");
            String Nation = sc.nextLine();
            System.out.println("Gender  1.Male 2.Female");
            int male = 1;
            if (male == 1) {
                System.out.println("Java");
            }

        }

        myproject jav = new myproject();
        System.out.println("1. DEPOSITE");
        System.out.println("2. FASTCASH");
        System.out.println("3. TRANSFER");
        System.out.println("4. CASH WITHDRAWAL");
        System.out.println("5. PIN CHANGE");
        System.out.println("6. BALANCE INQURY");
        System.out.println("7. MAIN STATEMENT");
        System.out.println("8. OTHER");
        System.out.println();
        System.out.println("Enter Any Key....");
        int put = sc.nextInt();
        switch (put) {
            case 1:
                myproject1.Deposite();
                break;
            case 2:
                myproject1.fastcase();
                break;
            case 3:
                myproject1.transfer();
                break;
            case 4:
                myproject1.cashwithdrawal();
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                System.out.println("Invalid choice.");

        }

    }
}
