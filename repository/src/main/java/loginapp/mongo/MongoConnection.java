package loginapp.mongo;

import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by Maria Simion on 03.07.2015.
 */
public class MongoConnection {

    public static MongoClient getMongoClient() {
        try {
            return new MongoClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

}
