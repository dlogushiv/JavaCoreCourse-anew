package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    protected List<T> dataBase = new ArrayList<>();


    @Override
    public T save(T t) {
        if (t != null) {
            dataBase.add(t);
            System.out.println(t + " was saved to database.");
            return t;
        } else {
            return t;
        }
    }

    @Override
    public void delete(T t) {
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i).equals(t)) {
                System.out.println(t + " was deleted from database.");
                dataBase.remove(i);
            }
        }
    }

    @Override
    public void deleteAll(List<T> list) {
        if (list.size() != 0) {
            dataBase.removeAll(list);
        } else {
            System.out.println("Input list is empty.");
        }
    }

    @Override
    public void saveAll(List<T> list) {
        if (list.size() != 0) {
            dataBase.addAll(list);
        } else {
            System.out.println("Input list is empty.");
        }
    }

    @Override
    public List<T> getList() {
        return dataBase;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }
}
