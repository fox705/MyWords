package MyWords.Dal;

import MyWords.Core.Sentence;
import org.json.JSONObject;

public class JsonDataBaseConnection implements IDataBaseConnection {

    JSONObject jo = new JSONObject();

    public void Connect() {

    }

    public void get(int id) {

    }

    public void add(Sentence sentence) {
        jo.put("Sentence", sentence);
    }




    public void update(int id) {

    }

    public void delete(int id) {

    }
}
