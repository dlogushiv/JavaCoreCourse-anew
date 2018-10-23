package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAOImpl implements AbstractDAO {
    List<User> userDataBase = dataBase;

    @Override
    public Object save(Object o) {
        return super.save(o);
    }

    @Override
    public void delete(Object o) {
        super.delete(o);
    }

    @Override
    public void deleteAll(List list) {
        super.deleteAll(list);
    }

    @Override
    public void saveAll(List list) {
        super.saveAll(list);
    }

    @Override
    public List getList() {
        return super.getList();
    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < userDataBase.size(); i++) {
            if (userDataBase.get(i).getId() == id) {
                System.out.println("User " + userDataBase.get(i) + " was deleted from user database.");
                userDataBase.remove(i);
            }
        }
    }

    @Override
    public User get(long id) {
        for (User user : userDataBase) {
            if (user.getId() == id) {
                return user;
            }
        }
        System.out.println("User with id=" + id + " was not found in user database.");
        return null;
    }
}
