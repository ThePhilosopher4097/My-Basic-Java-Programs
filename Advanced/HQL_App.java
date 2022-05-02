import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;
import javax.persistence.*;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQL_App {
   
    public static void main(String args[]) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {

        // Session Creation and Prerequisites------------------------>
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("\n\n******** Welcome to SCET Student Portal ************ \n");
        String SelectQuery;
        Query q;
        Transaction tx;
        List<Student> students;

        //__________________________________________________________________________________________________

        // Menu Driver
        
        do{
            System.out.println("\n<-------------Menu ---------->\n0.Exit\n1.Insert\n2.Update\n3.Delete\n4.Show Records\n");
            choice = sc.nextInt();

            switch(choice){

                case 0:
                    System.out.println("\nThank you !\n");
                    break;

                case 1:
                    Student st = new Student();
                    //st.setSid(5);
                    System.out.print("\nFill student details:\n Enter the Student Name -------> ");
                    st.setName(sc.next());
                    System.out.print("\n Enter the Student City -------> ");
                    st.setCity(sc.next());
                    System.out.print("\n Enter the Student Email ID -------> ");
                    st.setEmail(sc.next());
                    
                    session.beginTransaction();
                    session.save(st);
                    session.getTransaction().commit();
                
                    break;

                case 2:
                    // Update ------------------------------->
                    tx = session.beginTransaction();
                    //System.out.println("\nWhat do you need to update ?");
                    
                    String UpdateQuery = "update Student set city='Los Angeles' where city='Pune'";
                    q = session.createQuery(UpdateQuery);
                    int r = q.executeUpdate();
                    System.out.println(r+" Records updated");
                    tx.commit();
        
                    System.out.println("\nStudent Table Records --------> \n\t|\tID\t|\tName\t|\tEmail\t|\tCity\t|\t\n");
                    SelectQuery = "from Student";
                    q = session.createQuery(SelectQuery);
                    students = q.list();
                    for(Student S:students) {
                        System.out.println("\t|\t"+S.getSid()+"\t|\t"+S.getName()+"\t|\t"+S.getEmail()+"\t|\t"+S.getCity()+"\t|\t\n");
                    }
                    break;

                case 3:
                    // Delete ------------------------------->

                    tx = session.beginTransaction();
                    System.out.println("\nEnter the Query Column -------> ");
                    String column = sc.next();
                    System.out.println("\nEnter the Query value -------> ");
                    String value = sc.next();
                    String DeleteQuery = "delete Student where "+column+"='"+value+"'";
                    q = session.createQuery(DeleteQuery);
                    r = q.executeUpdate();
                    System.out.println(r+" Records deleted");
                    tx.commit();

                    SelectQuery = "from Student";
                    q = session.createQuery(SelectQuery);
                    students = q.list();
                    System.out.println("\nStudent Table Records --------> \n\t|\tID\t|\tName\t|\tEmail\t|\tCity\t|\t\n");
                    for(Student S:students) {
                        System.out.println("\t|\t"+S.getSid()+"\t|\t"+S.getName()+"\t|\t"+S.getEmail()+"\t|\t"+S.getCity()+"\t|\t\n");
                    }
                    break;
                case 4:
                    // Display Records ------------------------->
                    SelectQuery = "from Student";
                    q = session.createQuery(SelectQuery);
                    students = q.list();
                
                    System.out.println("\nStudent Table Records --------> \n\t|\tID\t|\tName\t|\tEmail\t|\tCity\t|\t\n");
                    for(Student S:students) {
                        System.out.println("\t|\t"+S.getSid()+"\t|\t"+S.getName()+"\t|\t"+S.getEmail()+"\t|\t"+S.getCity()+"\t|\t\n");
                    }
                    break;
            }

        }while(choice!=0);

        // Close ------------------------------->
        session.close();
        factory.close();
    }
}
