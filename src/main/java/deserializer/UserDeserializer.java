package deserializer;

import model.UsersList;

public interface UserDeserializer {

    UsersList deserialize(String filename);
}
