package study.javarush.DAO;

import study.javarush.modeles.User;
import org.hibernate.Session;
import study.javarush.Utils.HibernateSessionFactoryUtil;
import org.hibernate.Transaction;

public class UserDao {
    public void save(User user) {
        System.out.println("User DAO Создание пользователя");
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.persist(user);
        tx1.commit();
        session.close();
    }
}
