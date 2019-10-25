package MyWords.Translate;

public interface IDataBaseConnection {

    public void Connect();
    public void get(int id);
    public void add();
    public void update();
    public void delete();

}
