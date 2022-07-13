package Lesson5HW;


import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

      System.out.println("****Вариант1****");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("HW_5.csv"))) {
            bw.write("Value1; Value2; Value3\n");
            bw.write("100; 200; 123\n");
            bw.write("300; 400; 500\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("HW_5.csv"))) {
            String s;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("****Вариант2****");

      ArrayList<AppData> appDataArrayList = new ArrayList<>();

      AppData a1 = new AppData("Value1","Value2","Value3\n");
      AppData a2 = new AppData("100","200","123\n");
      AppData a3 = new AppData("300","400","500\n");

     appDataArrayList.add(a1);
     appDataArrayList.add(a2);
     appDataArrayList.add(a3);

        try (PrintWriter printWriter = new PrintWriter("HW_5_2.csv")) {
            printWriter.println(appDataArrayList.toString().replaceAll("\\[|\\]|\\,", ""));
            } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("HW_5_2.csv"))) {
            String temp;

            while((temp = bufferedReader.readLine()) != null){
                System.out.println(temp);
               }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}

