package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.UsersList;
import java.io.File;
import java.io.IOException;


public class JsonUserSerializer implements UserSerializer {
    public File serialize(UsersList usersList, String filename) {

        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter objectWriter = mapper.writerFor(UsersList.class);
        File file = new File(filename);
        try {
            objectWriter.writeValue(file, usersList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}