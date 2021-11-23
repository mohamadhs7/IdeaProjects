package com.dotin.depositProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static com.dotin.depositProject.Deposit.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File paymentFile = new File("PaymentFile.txt");
        FileWriter transactionFile = new FileWriter("TransactionFile.txt");
        Deposit deptor =makeDeptorObject(paymentFile);
        ArrayList<Deposit> creditorList=makeCreditorList(paymentFile);
        Pay(deptor,creditorList,transactionFile);
    }

}