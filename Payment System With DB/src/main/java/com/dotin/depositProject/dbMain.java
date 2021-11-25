package com.dotin.depositProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static com.dotin.depositProject.Deposit.makeCreditorList;
import static com.dotin.depositProject.Deposit.makeDeptorObject;

public class dbMain   {
    public static void main(String[] args) throws FileNotFoundException {
        File paymentFile = new File("PaymentFile.txt");
        Deposit deptor =makeDeptorObject(paymentFile);
        ArrayList<Deposit> creditorList=makeCreditorList(paymentFile);

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.getCurrentSession();
        Transaction tx= session.beginTransaction();

        session.save(deptor);
        for (Deposit s : creditorList){
            session.save(s);
        }


        tx.commit();
       // session.close();
    }
}
