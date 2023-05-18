package org.example.userdao;

import org.example.models.Auto;
import org.example.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.example.utils.HibernateSessionFactoryUtil;
import java.util.List;

public class UserDao {
    public User getUserById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    /*public Auto getAutoById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Auto auto = session.get(Auto.class, id);
        session.close();
        return auto;
    }*/

    public Auto getAutoById(int id){
        Session session = null;
        Auto auto = null;
        try{
            session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            auto = session.get(Auto.class, id);
        }catch (Exception ex){
            System.out.println("Exception");
        }
        finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return auto;
    }

    public List<User> findAll(){
        Session session = null;
        List<User> users = null;
        try{
            session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            users = (List<User>) session.createQuery("from User").list();
        }catch (Exception ex){
            System.out.println("Exception");
        }
        finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return users;
    }

    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }
    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }
    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }
}