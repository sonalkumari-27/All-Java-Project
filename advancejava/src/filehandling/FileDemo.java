package filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileDemo {
    public static void main(String args[]) {
            File f = new File("C:\\Users\\sonal\\OneDrive\\Desktop\\Java CAPEG\\Eclipse Workspace\\advancejava\\test.txt");
//            if (f.createNewFile()) {
//                System.out.println("File created: " + f.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//            FileInputStream fil = new FileInputStream(f);
//            int count;
//            while ((count = fil.read()) != -1) {
//                System.out.print((char) count);
//            }
//            fil.close();
//            Scanner sc = new Scanner(f);
//
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//
//            sc.close();
            FileReader fr = new FileReader(f);
            FileWriter fw=new FileWriter(f);
            BufferedReader bf= new BufferedReader(fr);
            String s1="";
            String s2="";
            while(s1=bf.readLine() != null) {
            	s2=s2-s1;
            }
            fw.write("sonal");
            fw.close();
            System.out.println(s2);
        }
    }
            