// Készítette: Vitovszki Tamás
// Dátum: 2023.10.05.
// Osztály: Szoft/II/2/N
package view;

import java.util.ArrayList;

import model.Employee;

public class MainConsole {
    public void showData(ArrayList<Employee> emplist){
        for(int i = 0; i < emplist.size();i++){
            String line = (emplist.get(i).getName()+", "+emplist.get(i).getCity()+", "+emplist.get(i).getAddress()+", "+emplist.get(i).getBirth()+", "+emplist.get(i).getSalary());
            System.out.println(line);
        }
    }
}
