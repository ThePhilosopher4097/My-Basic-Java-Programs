
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;

/*import javax.persistence.PersistenceException;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
*/
public class App {    
    public static void main(String[] args) {    
            
        //Create typesafe ServiceRegistry object    
        System.out.println("Hola Amigos !");

        SessionFactory fact = new Configuration().configure().buildSessionFactory();
        System.out.println("Session Factory object ------> "+fact);

        Student st = new Student();
        //st.setSid(1);
        st.setName("Amey");
        st.setCity("Pune");

        Session session = fact.openSession();
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();


        fact.close();
    }    
}   