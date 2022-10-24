package org.example;

import org.example.classicMusicPlayer.ClassicPlayer;
import org.example.rockMusicPlayer.RockPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        var rockPlayerBean = (RockPlayer) ac.getBean("rockPlayer");
        rockPlayerBean.addTrackToList();
        rockPlayerBean.playTrack(1);

//        var classicPlayerBean = (ClassicPlayer)ac.getBean("classicPlayer");
//        classicPlayerBean.addTrackToList();
//        classicPlayerBean.playTrack(0);

    }
}