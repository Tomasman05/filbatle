package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {

    final private String FILENAME ="filbt.txt";
    ArrayList<Employee> emplist = new ArrayList<>();
    public ArrayList<Employee> loadData(){
        try {
            tryLoadData();
        } catch (FileNotFoundException e) {
            System.err.println("A file nem található!");
            System.err.println(e.getMessage());
        }
        return emplist;
    }
    public ArrayList<Employee> tryLoadData() throws FileNotFoundException{
        
        File file = new File(FILENAME);
        Scanner sc = new Scanner(file,"utf-8");
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] list = line.split(":");
            Employee emp = new Employee();
            emp.setName(list[0]);
            emp.setCity(list[1]);
            emp.setAddress(list[2]);
            emp.setBirth(list[3]);
            emp.setSalary (Integer.parseInt(list[4]));
            this.emplist.add(emp);
        }
        sc.close();
        return emplist;
    }
}
