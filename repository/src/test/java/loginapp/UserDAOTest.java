package loginapp;

import loginapp.dao.DaoLocator;
import loginapp.dao.UserDAO;
import loginapp.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maria Simion on 30.06.2015.
 */
public class UserDAOTest {


    UserDAO userDAO = DaoLocator.getUserDao();

    @Test
    public void testFindUserByUsername() {

        assertEquals(new User("Maria"), userDAO.findUserByUsername("Maria"));
    }

    @Test
    public void testSaveUser() {
        User user = new User("Miki", "parolasupersecreta");
        userDAO.createUser(user);
        assertEquals(user, userDAO.findUserByUsername("Miki"));
    }

}
