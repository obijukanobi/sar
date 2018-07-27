package org.ac.hackathon;

import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
public class Requests {

    private int id;
    private int state;
    private Integer did;
    private List<String> matches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Requests{" +
                "id=" + id +
                ", state=" + state +
                '}';
    }
}
