/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeexecoes;

/**
 *
 * @author Admin
 */
public class TratandoExecoes {

    public static void main(String[] args) {
        try{
            int x = 1/0;
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("Continuou a Execução");
    }
}
