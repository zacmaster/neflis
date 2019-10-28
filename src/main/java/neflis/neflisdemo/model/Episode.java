package neflis.neflisdemo.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;

public class Episode {
    private String id;
    @JsonSetter("Episode")
    private int number;
    private String duration;
    private ArrayList<String> guestActors;

    public Episode(){}

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

    public ArrayList<String> getGuestActors() {
        return guestActors;
    }

    public void setGuestActors(ArrayList<String> guestActors) {
        this.guestActors = guestActors;
    }
}
