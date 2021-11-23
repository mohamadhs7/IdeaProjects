package com.dotin.depositProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String debtorDepositNumber=null;
        double debtorAmount=0;

        HashMap<String,Double> creators = new HashMap<String, Double>();
        Scanner s1 = new Scanner(new File("C:\\Users\\sadeghi\\Desktop\\PaymentFile.txt"));
        while (s1.hasNextLine()) {
                String s=null;
                Scanner s2 = new Scanner(s1.nextLine());
                s = s2.next();
                if(s.equals("debtor")){
                    debtorDepositNumber=s2.next();
                    debtorAmount=s2.nextDouble();
                }else {
                    String creatorDepositNumber=s2.next();
                double creatorAmount=s2.nextDouble();
                creators.put(creatorDepositNumber,creatorAmount);
                }
        }


        Iterator<Map.Entry<String, Double>> itr = creators.entrySet().iterator();
        ArrayList<Deposit> creatorDeposits = new ArrayList<Deposit>();
        while(itr.hasNext())
        {
            Map.Entry<String, Double> entry = itr.next();
            Deposit d = new Deposit(entry.getKey(),entry.getValue(),DepositState.creditor);
          creatorDeposits.add(d);
        }

    }
    public void Pay(String debtorDepositNumber, double debtorAmount, ArrayList<Deposit> creatorDeposits){
        double requiredAmount=0;
        for(Deposit d :creatorDeposits){
            requiredAmount=d.getAmount()+requiredAmount;
        }
        if(debtorAmount>=requiredAmount){
            for(Deposit d :creatorDeposits){
                debtorAmount=debtorAmount-d.getAmount();
                d.setState(DepositState.clear);
            }
        }else
            System.out.println("debtorAmount is not Enough");
    }
}
