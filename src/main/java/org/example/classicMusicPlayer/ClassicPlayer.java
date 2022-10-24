package org.example.classicMusicPlayer;

import org.example.classicMusicPlayer.classicTrack.ClassicTrack;

import java.util.ArrayList;

public class ClassicPlayer {

    ArrayList<ClassicTrack> classicTrackList = new ArrayList<>();
    ClassicTrack firstClassicTrack;
    ClassicTrack secondClassicTrack;

    public void addTrackToList() {
        classicTrackList.add(firstClassicTrack);
        classicTrackList.add(secondClassicTrack);
    }

    public void playTrack(int numberTrack) {
        System.out.println("Track number " + numberTrack + " is playing now" + "Track information:  " + classicTrackList.get(numberTrack));
    }

    public ArrayList<ClassicTrack> getClassicTrackList() {
        return classicTrackList;
    }

    public void setClassicTrackList(ArrayList<ClassicTrack> classicTrackList) {
        this.classicTrackList = classicTrackList;
    }

    public ClassicTrack getFirstClassicTrack() {
        return firstClassicTrack;
    }

    public void setFirstClassicTrack(ClassicTrack firstClassicTrack) {
        this.firstClassicTrack = firstClassicTrack;
    }

    public ClassicTrack getSecondClassicTrack() {
        return secondClassicTrack;
    }

    public void setSecondClassicTrack(ClassicTrack secondClassicTrack) {
        this.secondClassicTrack = secondClassicTrack;
    }

    @Override
    public String toString() {
        return "ClassicPlayer{" +
                "classicTrackList=" + classicTrackList +
                ", firstClassicTrack=" + firstClassicTrack +
                ", secondClassicTrack=" + secondClassicTrack +
                '}';
    }
}
