package MyWords.Manager;

import MyWords.Core.Sentence;
import MyWords.Dal.JsonDataBaseConnection;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager {

    JsonDataBaseConnection db = new JsonDataBaseConnection();
    Scanner sc;
    Sentence sentence;
    int id = 1;


    public void readFile(String file) throws FileNotFoundException {

        sc = new Scanner(new File(file));
        String line;
        while(sc.hasNext()){
            sc.delimiter();
            db.add(new Sentence(id++, sc.next("[ , ]")));
            
        }

    }

}
