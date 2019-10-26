package MyWords.Domain;

import MyWords.Dal.JsonDataBaseConnection;
import MyWords.Manager.Manager;

public class Main {

    public static void main(String[] args){

        JsonDataBaseConnection db = new JsonDataBaseConnection();

        Manager manager = new Manager("article.txt");


    }

}
