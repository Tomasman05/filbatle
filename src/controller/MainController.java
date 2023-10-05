/*
* File: MainController.java
* Author: Vitovszki Tamás
* Copyright: 2023, Vitovszki Tamás
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/Tomasman05/
* Licenc: GNU GPL
*/
package controller;

import model.Filereader;
import view.MainConsole;

public class MainController {
    public MainController(){
        new MainConsole().showData(new Filereader().loadData());

    }
}
