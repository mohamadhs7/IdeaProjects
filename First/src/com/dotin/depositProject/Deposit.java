package com.dotin.depositProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Deposit {
    private String depositNumber;
    private double amount;
    private DepositState state;

    public Deposit(){}
    public Deposit(String depositNumber, double amount, DepositState depositState) {
        this.depositNumber = depositNumber;
        this.amount = amount;
        this.state = depositState;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public DepositState getState() {
           return state;
    }

    public void setState(DepositState state) {
        this.state = state;
    }

    public static Deposit makeDeptorObject(File paymentFile) throws FileNotFoundException {
        Scanner s1 = new Scanner(paymentFile);
        Deposit debtorObject=new Deposit();
        while (s1.hasNextLine()) {
            Scanner s2 = new Scanner(s1.nextLine());
            String s=null;
            s = s2.next();
            if(s.equals("debtor")){
                debtorObject.setDepositNumber(s2.next());
                debtorObject.setAmount(s2.nextDouble());
            }
        }
        return debtorObject;
    }
    public static ArrayList<Deposit> makeCreditorList(File paymentFile) throws FileNotFoundException{
        HashMap<String,Double> creators = new HashMap<>();
        Scanner s1 = new Scanner(paymentFile);
        while (s1.hasNextLine()) {
            Scanner s2 = new Scanner(s1.nextLine());
            String s=null;
            s = s2.next();
            if(s.equals("creditor")){
                String creatorDepositNumber=s2.next();
                double creatorAmount=s2.nextDouble();
                creators.put(creatorDepositNumber,creatorAmount);
            }
        }
        Iterator<Map.Entry<String, Double>> itr = creators.entrySet().iterator();
        ArrayList<Deposit> creatorDeposits = new ArrayList<>();
        while(itr.hasNext())
        {
            Map.Entry<String, Double> entry = itr.next();
            Deposit d = new Deposit(entry.getKey(),entry.getValue(),DepositState.creditor);
            creatorDeposits.add(d);
        }
        return creatorDeposits;
    }
    public  static void AmountFileProcess( ArrayList<Deposit> deposits){
        //Creating Amount File
        try {
            File amountFile = new File("AmountFile.txt");
            if (amountFile.createNewFile()) {
                System.out.println("File created: " + amountFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Writing in Amount File
        try {
            FileWriter myWriter = new FileWriter("AmountFile.txt");
            for(Deposit d:deposits) {
                if(d.getState()==DepositState.creditor) {
                    myWriter.write(d.getDepositNumber() + "    " + 0 + "\n");
                }else{
                    myWriter.write(d.getDepositNumber() + "    " + d.getAmount() + "\n");
                }
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void Pay(Deposit debtor, ArrayList<Deposit> creatorDeposits, FileWriter transactionFile) throws IOException {
        double requiredAmount=0;
        for(Deposit d :creatorDeposits){
            requiredAmount=d.getAmount()+requiredAmount;
        }
        if(debtor.getAmount()>=requiredAmount){
            for(Deposit d :creatorDeposits){
                transactionFile.write(debtor.getDepositNumber()+"     "+d.getDepositNumber()+"    "+d.getAmount()+"\n");
                debtor.setAmount(debtor.getAmount()-d.getAmount());
                d.setState(DepositState.clear);
            }
            transactionFile.close();
            debtor.setState(DepositState.clear);
            ArrayList<Deposit> deposits= new ArrayList<>();
            deposits.add(debtor);
            deposits.addAll(creatorDeposits);
            AmountFileProcess(deposits);
            System.out.println("Transaction File Created");
        }else
            System.out.println("debtorAmount is not Enough");
    }
}