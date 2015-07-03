package loginapp.dao;

/**
 * Created by Maria Simion on 03.07.2015.
 */
public final class DaoLocator {

    public static UserDAO getUserDao() {
        return new UserDaoMongo();
    }

}
