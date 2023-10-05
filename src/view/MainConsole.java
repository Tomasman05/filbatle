/*
* File: MainConsole.java
* Author: Vitovszki Tamás
* Copyright: 2023, Vitovszki Tamás
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/Tomasman05/
* Licenc: GNU GPL
*/
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
