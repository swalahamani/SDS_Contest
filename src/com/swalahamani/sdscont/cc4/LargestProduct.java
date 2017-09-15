/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swalahamani.sdscont.cc4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Swalah Amani
 */
public class LargestProduct {
    public static void main(String[] args) {
        ArrayList<BigInteger> products = new ArrayList<>();
        int k;

        Scanner sc = new Scanner(System.in);

        System.out.print("X: ");
        String x = sc.nextLine();
        System.out.print("K: ");
        k = sc.nextInt();

        int size = x.length();
        
        if(k<=size){
            for(int i=0; i<size; i++){
                BigInteger prd = getProduct(x, i, k);
                if(prd.compareTo(new BigInteger("-1")) != 0){
                    products.add(prd);
                }
                else
                {
                    break;
                }
            }
            Collections.sort(products);
            System.out.println("LargestProduct: "+products.get(products.size()-1));
        }
    }
    static BigInteger getProduct(String num,int begIndex,int noD){
        BigInteger prd = new BigInteger("1");
        
        if((begIndex + noD) <= num.length()){
            for(int i = begIndex; i<(begIndex + noD); i++){
                prd = prd.multiply(new BigInteger(String.valueOf(num.charAt(i))));
            }
        }
        else{
            prd = new BigInteger("-1");
        }
        
        return prd;
    }
}
