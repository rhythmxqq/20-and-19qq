package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        group lol = new group();
        group kek = new group();
        group zaz = new group();
        group lal = new group();

        User user1 = new User("Никита");
        User user2 = new User("Срегей");
        lol.regObserver(user1);
        lol.regObserver(user2);
        kek.regObserver(user1);
        kek.regObserver(user2);
        zaz.regObserver(user1);
        zaz.regObserver(user2);
        lal.regObserver(user2);

        lol.setNews("что я покушал");
        System.out.println("\n");
        kek.setNews("что я поспал");
        System.out.println("\n");
        lal.setNews("что я очень поел");
    }
}
interface Observable {
    void notifyObservers();
    void regObserver(Observer o);
}
interface Observer{
    void update(String news);
}
class group implements Observable{
    List<Observer> list = new ArrayList<>();
    String news = "Новость1";
    void setNews(String news){
        this.news = news;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer o: list){
            o.update(news);
        }
    }

    @Override
    public void regObserver(Observer o) {
        list.add(o);
    }
}
class User implements Observer{
    String name;
    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " узнал "+ news);
    }
}