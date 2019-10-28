package neflis.neflisdemo.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;

public class Serie extends Contenido{
    public Serie(){}
    private ArrayList<Season> seasons;
    @JsonSetter("totalSeasons")
    private int numberOfSeasons;


    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(ArrayList<Season> seasons) {
        this.seasons = seasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
}
