package module8.homework;

import java.util.List;

public interface AbstractDAO <T>{
    T save(T t);
    void delete(T t);
    void deleteAll(List<T> list);
    void saveAll(List<T> list);
    List<T> getList();
    void deleteById(long id);
    T get(long id);
}
