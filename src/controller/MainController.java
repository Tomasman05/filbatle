// Készítette: Vitovszki Tamás
// Dátum: 2023.10.05.
// Osztály: Szoft/II/2/N
package controller;

import model.Filereader;
import view.MainConsole;

public class MainController {
    public MainController(){
        new MainConsole().showData(new Filereader().loadData());

    }
}
