import com.company.hrm.dao.impl.UserDaoImpl;
import com.company.hrm.dao.pojo.User;

public class Main {
    public static void main(String[] args) throws  Exception{
        UserDaoImpl u = new UserDaoImpl();
        User user = new User("123","123",1);
        u.regist(user);
    }
}
