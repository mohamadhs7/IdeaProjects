package com.dotin.depositProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String debtorDepositNumber=null;
        double debtorAmount=0;


        Scanner s1 = new Scanner(new File("C:\\Users\\sadeghi\\Desktop\\PaymentFile.txt"));
        while (s1.hasNextLine()) {
                String s=null;
                Scanner s2 = new Scanner(s1.nextLine());
                s = s2.next();
                if(s.equals("debtor")){
                    debtorDepositNumber=s2.next();
                    debtorAmount=s2.nextDouble();
                    break;
                }
        }

        HashMap<String,Double> creators = new HashMap<String, Double>();
        Scanner s3 = new Scanner(new File("C:\\Users\\sadeghi\\Desktop\\AmountFile.txt"));
        while (s3.hasNextLine()) {
            String s=null;
            Scanner s4 = new Scanner(s3.nextLine());
            s = s4.next();
            if(s.equals(debtorDepositNumber)){
                continue;
            }else {
            while (s4.hasNext()){
                String creatorDepositNumber=s;
                double creatorAmount=s4.nextDouble();
                creators.put(creatorDepositNumber,creatorAmount);
            }
            }
        }
        System.out.println(creators);
    }
}
