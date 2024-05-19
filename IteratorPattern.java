public interface Iterator{
    public boolean hasNext();
    public Object next();
}

public interface NamesCollection{
    public Iterator getIterator();
}


public class IteratorPattern implements NamesCollection{
    public String[] names = {"Ram", "Shyam", "Hari", "sita"};
    @Override
    public Iterator getIterator() {
        return new NamesCollection(this)

    }
}

