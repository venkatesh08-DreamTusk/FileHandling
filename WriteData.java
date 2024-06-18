import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class WriteData {
    Scanner in = new Scanner(System.in);
    private   File file;
    private   FileWriter fileWriter;
    private   FileReader fileReader;
    private   BufferedWriter bufferedWriter;
    private   BufferedReader bufferedReader;
    private   Date date = new Date();

    public void write() {
        file = new File("C:\\Users\\Venkatesh\\Desktop\\FileHandling\\Data.txt");
             try {
        fileWriter = new FileWriter(file,true);
        bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(String.valueOf(date));
            bufferedWriter.newLine();
            System.out.println("Enter Your Name:- ");
            String name = in.next();
            bufferedWriter.append(name);
            bufferedWriter.newLine();
            System.out.println("Enter Your Name:- ");
            String age = in.next();
            bufferedWriter.append(age);
            bufferedWriter.newLine();
            bufferedWriter.append("---------------------------------------------------------");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();


        }catch (IOException e){
            e.printStackTrace();
        }

             System.out.println("If You Want Add More Data press '1' Else press any Number :-");
             int option = in.nextInt();
             switch (option){
                 case 1:
                     write();
                     break;
                 default:
                     read();
             }

    }

    public void read(){
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String output = bufferedReader.readLine();
            while (output != null){
                System.out.println(output);
                output = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }



}