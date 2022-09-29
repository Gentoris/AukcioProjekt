package hu.petrik.festmeny;

import java.time.LocalDateTime;

public class Festmeny {

    private String cim;
    private  String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;


    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.legutolsoLicitIdeje = null;
        this.elkelt = false;
    }


    public String getFesto()
    {
        return festo;
    }

    public String getStilus()
    {
        return stilus;
    }

    public int getLicitekSzama()
    {
        return licitekSzama;
    }

    public int getLegmagasabbLicit()
    {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje()
    {
        return legutolsoLicitIdeje;
    }

    public boolean Elkelt()
    {
        return elkelt;
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = elkelt;
    }

}