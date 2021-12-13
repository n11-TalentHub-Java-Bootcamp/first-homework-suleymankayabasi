package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){

        try{
            Configuration configuration = new Configuration();

            SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

            return sessionFactory;

        }catch (Exception e){
            System.out.println("An Error Occurred When Creating SessionFactory " + e);
            throw new ExceptionInInitializerError(e);

        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
