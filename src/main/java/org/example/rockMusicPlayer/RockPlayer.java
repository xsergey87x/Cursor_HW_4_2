package org.example.rockMusicPlayer;

import org.example.rockMusicPlayer.rockTrack.RockTrack;

import java.util.ArrayList;

public class RockPlayer {

    ArrayList<RockTrack> rockTrackList = new ArrayList<>();
    RockTrack firstRockTrack;
    RockTrack secondRockTrack;

    public void addTrackToList() {
        rockTrackList.add(firstRockTrack);
        rockTrackList.add(secondRockTrack);
    }

    public void playTrack(int numberTrack) {
        System.out.println("Track number " + numberTrack + " is playing now " + "Track information:  " + rockTrackList.get(numberTrack));
    }

    public ArrayList<RockTrack> getRockTrackList() {
        return rockTrackList;
    }

    public void setRockTrackList(ArrayList<RockTrack> rockTrackList) {
        this.rockTrackList = rockTrackList;
    }


    @Override
    public String toString() {
        return "RockPlayer{" +
                "rockTrackList=" + rockTrackList +
                '}';
    }

    public RockTrack getFirstRockTrack() {
        return firstRockTrack;
    }

    public void setFirstRockTrack(RockTrack firstRockTrack) {
        this.firstRockTrack = firstRockTrack;
    }

    public RockTrack getSecondRockTrack() {
        return secondRockTrack;
    }

    public void setSecondRockTrack(RockTrack secondRockTrack) {
        this.secondRockTrack = secondRockTrack;
    }
}
