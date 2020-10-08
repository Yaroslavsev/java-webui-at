package serializer;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.UsersList;

import java.io.File;
import java.io.IOException;

public class XmlUserSerializer implements UserSerializer {
    public File serialize(UsersList usersList, String filename) {

        XmlMapper mapper = new XmlMapper();
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
