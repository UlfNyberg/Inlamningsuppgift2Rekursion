import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-01-12
 * Time: 10:38
 * Project: Inlämningsuppgift 2 Rekursion
 * Copyright: MIT
 */

public class Nisse {
    public String name;
    public List<Nisse> subordinate = new ArrayList<>();
    public Nisse boss;


    public Nisse (){}

    public Nisse (String name){
        this.name = name;
    }

    public Nisse (String name, Nisse boss, List<Nisse> subordinate) {
        this.name = name;
        this.boss = boss;
        this.subordinate = subordinate;
    }

    public Nisse (String name, List<Nisse> subordinate) {
        this.name = name;
        this.subordinate = subordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nisse getBoss() {
        return boss;
    }

    public void setBoss(Nisse boss) {
        this.boss = boss;
    }

    public List<Nisse> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(List<Nisse> subordinate) {
        this.subordinate = subordinate;
    }
}
