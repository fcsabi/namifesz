/*
* File: getNames.java
* Author: Farkas Csaba
* Copyright: 2022, Farkas CSaba
* Group: Szoft II N
* Date: 2022-10-24
* Github: https://github.com/fcsabi/
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.util.Arrays;

public class getNames implements Name {

    @Override
    public ArrayList<String> getNames() {
        String[] names = { "Bela", "Geza" };
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        return nameList;
    }

}
