package com.dotin.depositProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creating Objects for inserting data
        Deposit d1 = new Deposit("1.10.100.1",1000,DepositState.debtor);
        Deposit d2 = new Deposit("1.20.100.1",300,DepositState.creator);
        Deposit d3 = new Deposit("1.20.100.2",700,DepositState.creator);
        
        ArrayList<Deposit> deposits = new ArrayList<Deposit>();
        deposits.add(d1);
        deposits.add(d2);
        deposits.add(d3);

        //Creating Payment File
        try {
            File paymentFile = new File("C:\\Users\\admin\\Desktop\\PaymentFile.txt");
            if (paymentFile.createNewFile()) {
                System.out.println("File created: " + paymentFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Writting in Payment File
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\admin\\Desktop\\PaymentFile.txt");
            for(Deposit d:deposits) {
                myWriter.write(d.getState()+"    "+d.getDepositNumber()+"    "+d.getAmount()+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file:");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Creating Amount File
        try {
            File amountFile = new File("C:\\Users\\admin\\Desktop\\AmountFile.txt");
            if (amountFile.createNewFile()) {
                System.out.println("File created: " + amountFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Writting in Payment File
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\admin\\Desktop\\AmountFile.txt");
            for(Deposit d:deposits) {
                myWriter.write(d.getDepositNumber()+"    "+d.getAmount()+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}