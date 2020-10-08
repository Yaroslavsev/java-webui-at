package serializer;

import model.User;
import model.UsersList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class UserSerializerTest {

    @Test
    void serializeJson() {

        UsersList usersList = prepareTestData();

        JsonUserSerializer jsonUserSerializer = new JsonUserSerializer();
        jsonUserSerializer.serialize(usersList, "usersList.json");
    }

    @Test
    void serializeXml() {

        UsersList usersList = prepareTestData();

        XmlUserSerializer xmlUserSerializer = new XmlUserSerializer();
        xmlUserSerializer.serialize(usersList, "usersList.xml");
    }


    private UsersList prepareTestData() {
        User anton = new User(1, "Антон", "anton@mail.ru");
        User alex = new User(2, "Алекс", "alex@mail.ru");
        User boris = new User(3, "Борис", "boris@mail.ru");
        User vlad = new User(4, "Влад", "vlad@mail.ru");
        User george = new User(5, "Георгий", "george@mail.ru");
        User dan = new User(6, "Данил", "dan@mail.ru");
        User egor = new User(7, "Егор", "egor@mail.ru");
        User john = new User(8, "Женя", "john@mail.ru");
        User zakaria = new User(9, "Захар", "zakaria@mail.ru");
        User ilya = new User(10, "Илья", "ilya@mail.ru");

        UsersList usersList = new UsersList();
        usersList.setUsersList(new ArrayList<User>());
        usersList.getUsersList().add(anton);
        usersList.getUsersList().add(alex);
        usersList.getUsersList().add(boris);
        usersList.getUsersList().add(vlad);
        usersList.getUsersList().add(george);
        usersList.getUsersList().add(dan);
        usersList.getUsersList().add(egor);
        usersList.getUsersList().add(john);
        usersList.getUsersList().add(zakaria);
        usersList.getUsersList().add(ilya);
        return usersList;
    }
}