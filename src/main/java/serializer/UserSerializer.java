package serializer;

import model.UsersList;

import java.io.File;

public interface UserSerializer {

    File serialize (UsersList usersList, String filename);
}
