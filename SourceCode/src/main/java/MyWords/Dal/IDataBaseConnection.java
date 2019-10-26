package MyWords.Dal;

import MyWords.Core.Sentence;

public interface IDataBaseConnection {

    public void Connect();
    public void get(int id);
    public void add(Sentence sentence);
    public void update(int id);
    public void delete(int id);

}
