package neflis.neflisdemo.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;

public class Season {
    private String id;
    @JsonSetter("Season")
    private int number;
    private String duration;
    @JsonSetter("Episodes")
    private ArrayList<Episode> episodes;
    private int numberOfEpisodes;

    public Season(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }
}
