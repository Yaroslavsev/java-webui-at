package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.UsersList;

import java.io.File;
import java.io.IOException;

public class JsonUserDeserializer implements UserDeserializer{
    public UsersList deserialize(String filename) {

        ObjectMapper mapper = new ObjectMapper();
        ObjectReader objectReader = mapper.readerFor(UsersList.class);
        UsersList o = null;
        try {
            o = objectReader.readValue(new File(filename), UsersList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return o;
    }
}
