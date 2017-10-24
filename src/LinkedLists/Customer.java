package LinkedLists;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Customer {
    private String name;
    private Double balances;


    public Customer(String name, Double balances){
        this.name = name;
        this.balances = balances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalances() {
        return balances;
    }

    public void setBalances(Double balances) {
        this.balances = balances;
    }
}
