package com.example.lib;

public class GroupInsurance {
    private String[] GIName=new String[100];
    private int CountN = 0;
    private String[] GPIName=new String[100];
    private String[] InsuranceCoverage=new String[100];

    public void inputdata(String giName, String gpiName, String insuranceCoverage) {
        GIName[CountN] = giName;
        GPIName[CountN] = gpiName;
        InsuranceCoverage[CountN] = insuranceCoverage;
        CountN++;
    }


    public void outputData() {
        System.out.println("Group accident insurance");
        for (int i = 0; i < CountN; i++)
            System.out.printf("company:%s name:%s Sum Insured:%s \n", GIName[i], GPIName[i], InsuranceCoverage[i]);
    }

}