class Account{
    private String accountNumber;
    private double balance;

    public void setaccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getaccountNumber(){
        return this.accountNumber;
    }
    public void setbalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }
        else{
            System.out.println("Invalid Balance");
        }
    }
    public double getbalance(){
        return this.balance;
    }

    public static void main(String arr[]){
        Account acc=new Account();
        acc.setaccountNumber("SBI1243548578475");
        acc.setbalance(500000.0);
        System.out.println("The account number: "+acc.getaccountNumber());
        System.out.println("The Current Balance in the account: "+acc.getbalance());
    }
}