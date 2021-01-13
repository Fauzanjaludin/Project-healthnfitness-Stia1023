/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waiz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class InputOutputAerobic {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("This is output from Aerobic Management System");
        list.add("This is the result");
        
        
        
    }
    public static void writeToFile(ArrayList<String> list){
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "AerobicOuput.txt"));
            for (String x : list){
                writer.write(x);
                writer.newLine();
            }
            writer.close();
        }catch (IOException e){
            e.getStackTrace();
        }
    }
    public static void UpdateToFile(ArrayList<String> list, String search, String update){
        System.out.println(list.toString());
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).equals(search)){
                list.set(i, update);
                writeToFile(list);
            }
        }
    }


}
