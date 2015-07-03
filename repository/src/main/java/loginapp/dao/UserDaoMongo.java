package loginapp.dao;

import com.mongodb.*;
import loginapp.model.User;
import loginapp.mongo.MongoConnection;

/**
 * Created by Maria Simion on 03.07.2015.
 */
public class UserDaoMongo implements UserDAO {


    public User findUserByUsername(String username) {
        MongoClient client = MongoConnection.getMongoClient();
        DB echoDB = client.getDB("echo");

        DBCollection usersCollection = echoDB.getCollection("users");

        DBObject searchCriteria = new BasicDBObject();
        searchCriteria.put("username", username);

        DBObject searchedUser = usersCollection.findOne(searchCriteria);

        if (searchedUser == null) {
            return null;
        }
        User user = new User();
        user.setUsername(searchedUser.get("username").toString());

        Object password = searchedUser.get("password");
        if (password != null) {
            user.setPassword(password.toString());
        }

        return user;
    }

    public void createUser(User user) {
        DBObject mongoUser = new BasicDBObject();
        mongoUser.put("password", user.getPassword());
        mongoUser.put("username", user.getUsername());


        MongoClient client = MongoConnection.getMongoClient();
        client.getDB("echo").getCollection("users").save(mongoUser);
    }
}
