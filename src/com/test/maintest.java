package com.test;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 * Created by Administrator on 2016/7/7.
 */

public class maintest {

    public static void main(String[] args)
    {



        SessionFactory factory=new AnnotationConfiguration().configure("/hibernate.cfg.xml").buildSessionFactory();
        Session session= factory.getCurrentSession();
        session.beginTransaction();

        //增加
        /*
        PlayersEntity players=new PlayersEntity();
        players.setId(3);
        players.setName("james");
        players.setPassword("james");

        session.save(players);
        */

        //查找
        /*
        PlayersEntity player2=(PlayersEntity) session.get(PlayersEntity.class,new Integer(3));
        System.out.print(player2.getName()+player2.getPassword());
        */

        //修改
        PlayersEntity player3=(PlayersEntity) session.get(PlayersEntity.class,new Integer(3));
        player3.setPassword("root");
        session.update(player3);  //删除同理，直接使用session.delete(player3)




        session.getTransaction().commit();


    }
}
