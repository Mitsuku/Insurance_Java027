package com.example.lib;

import java.util.concurrent.CountDownLatch;

public class PersonalInsurance {
    private String[] PIName=new String[100];
    private int CountN = 0;
    private String[] PIPhoneNumber=new String[100];
    private String[] InsuranceCoverage=new String[100];

    public void inputdata(String piName, String piPhoneNumber, String insuranceCoverage) {
        PIName[CountN] = piName;
        PIPhoneNumber[CountN] = piPhoneNumber;
        InsuranceCoverage[CountN] = insuranceCoverage;
        CountN++;
    }


    public void outputData() {
        System.out.println("Personal accident insurance");
        for (int i = 0; i < CountN; i++)
            System.out.printf("name:%s phone:%s Sum Insured:%s \n", PIName[i], PIPhoneNumber[i], InsuranceCoverage[i]);
    }

}