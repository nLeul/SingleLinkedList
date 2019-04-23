package linked_list;

public interface List<T> {

    public void addBeginning(T data);
    public void addLast(T data);
    public void addAtPosition(int index, T data);

    public void removeBeginning();
    public void removeLast();
    public void remove(T data);

    public T get(int index);
    public boolean find(T data);
    public int findIndex(T data);

    public int size();
    public void getAll();

    public T middleNode();
    public void reverse();


}
