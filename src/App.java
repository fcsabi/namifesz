/*
* File: App.java
* Author: Farkas Csaba
* Copyright: 2022, Farkas CSaba
* Group: Szoft II N
* Date: 2022-10-24
* Github: https://github.com/fcsabi/
* Licenc: GNU GPL
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Készitette: Farkas Csaba Szoft II N 2022-10-24");
        getNames getNames = new getNames();
        ArrayList<String> nameList = getNames.getNames();
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
