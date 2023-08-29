account){

        System.out.println("\n\nAccount User Name: " + account.getName());

        System.out.println("User Age: " + account.getAge());
        System.out.println("User Account ID No.: " + account.getaccoutID());
        System.out.println("User Mobile No.: " + account.getMobileNo());
        System.out.println("User Account Balance: " + account.getBalance());
        System.out.println("Today's Remaining withdrawn limit: " + account.getwithdrawlLimit());
    }

    public static void main(String[] args){
        Account_27051 account = null;
        boolean loop = true;
        int choice;

        while(loop){
            System.out.println("\n\n*******************MENU*******************");
            System.out.println("1.  Create an account");
            System.out.println("2.  Deposit money");
            System.out.println("3.  Withdraw money");
            System.out.println("4.  Check the balance");
            System.out.println("5.  Display Account information");
            System.out.println("6.  Exit");
            System.out.print("Enter your Choice: ");
            choice = scan.nextInt();


            switch(choice){
                case 1:
                    account = createAccount();
                    break;

                case 2:
                    depositMoney(account);
                    break;

                case 3:
                    withdrawMoney(account);
                    break;

                case 4:
                    checkBalance(account);
                    break;

                case 5:
                    displayAccountInformation(account);
                    break;
                
                case 6:
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid Choice..");
            }

            if(loop){
                System.out.print("Do you want to perform more actions? (1 for Yes/0 for No): ");
                int check = scan.nextInt();
                if(check == 0){
                    loop = false;
                }else if(check != 1){
                    System.out.println("Invalid choice..");
                    System.out.println("default choice Selected: 1");
                }
            }
        }
        
        System.out.println("Exiting...");
    }
}