//********************************************************
//     CustomerAccount.java        Author: Fiona Fung
//
//  provides information about a Bank customer
//********************************************************

public class CustomerAccount {
    // instance variables
    String name, accountType;
    int accountNum, IDNum;
    double bal;
    
    // constructor
    public CustomerAccount(String name, int accountNum, int IDNum, double bal, String accountType)
    {
        this.name = name;
        this.accountNum = accountNum;
        this.IDNum = IDNum;
        this.bal = bal;
        this.accountType = accountType;
    }

    // get methods
    public String getName() { return name; }
    public int getAccountNum() { return accountNum; }
    public int getIDNum() { return IDNum; }
    public double getBal() { return bal; }
    public String getAccountType() { return accountType; }

    // set methods
    public void setName(String name) { this.name = name; }
    public void setAccountNum(int accountNum) { this.accountNum = accountNum; }
    public void setIDNum(int IDNum) { this.IDNum = IDNum; }
    public void setBal(double bal) { this.bal = bal;}
    public void setAccountType(String accountType) { this.accountType = accountType; }

    // toString
    public String toString()
    {
        String result = "";
        result += "\nname: " + name;
        result += "\naccount number: " + accountNum;
        result += "\nid number: " + IDNum;
        result += "\nbalance: " + bal;
        result += "\naccount type: " + accountType;
        return result; 
    }    
}
