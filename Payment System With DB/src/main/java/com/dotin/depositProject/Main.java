package com.dotin.depositProject;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static com.dotin.depositProject.Deposit.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Deposit debtor =new Deposit();
        ArrayList<Deposit> creditor = new ArrayList<>();
        ArrayList<com.dotin.depositProject.Transaction> transactions = new ArrayList<>();
        int Result=0;

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.getCurrentSession();
        Transaction tx= session.beginTransaction();

//        debtor= (Deposit) session.get(Deposit.class,(long)1);
//        debtor.setAmount(5500);
//        session.update(debtor);

        Criteria cr = session.createCriteria(Deposit.class);
        ArrayList<Deposit> deposits = (ArrayList<Deposit>) cr.list();


        for (Deposit d:deposits){
            if(d.getState()==DepositState.debtor){
                debtor=d;
            }else {
                creditor.add(d);
            }
        }
        Result=Pay(debtor,creditor,transactions);
        if(Result==1) {
            session.save(debtor);
            for (Deposit d : creditor) {
                session.save(d);
            }
            for (com.dotin.depositProject.Transaction t : transactions) {
                session.save(t);
            }
        }else {
            System.out.println("Transaction Failed");
        }



        tx.commit();
        //session.close();


    }
}