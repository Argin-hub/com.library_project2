import buisness_logica.Util;
import entity.AuthorBooks;
import service.AuthorBooksService;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Util one = new Util();
        one.getConnection();
        AuthorBooksService authorLondon = new AuthorBooksService();
        AuthorBooks parametriLondon = new AuthorBooks();
        parametriLondon.setId(13);
        parametriLondon.setName("Jack");
        parametriLondon.setSurname("london");
        parametriLondon.setLanguage("eng");
        try {
//            authorLondon.add(parametriLondon);
            List<AuthorBooks> authorBooksList = authorLondon.getAuthor();
            for(AuthorBooks ww:authorBooksList){
                System.out.println(ww);
            }

        }
        catch (Exception f){
            f.printStackTrace();
        }
    }
}