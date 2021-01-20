import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-01-12
 * Time: 10:38
 * Project: Inlämningsuppgift 2 Rekursion
 * Copyright: MIT
 */

public class NisseUtil {

    protected List<Nisse> myNisses;


    public NisseUtil () {

        Nisse bladlusen = new Nisse("Bladlusen");
        Nisse dammråttan = new Nisse("Dammråttan");
        Nisse gråsuggan = new Nisse("Gråsuggan");
        Nisse tröger = new Nisse("Tröger");
        Nisse blyger = new Nisse("Blyger");
        Nisse rådjuret = new Nisse("Rådjuret");
        Nisse nyckelpigan = new Nisse("Nyckelpigan");
        Nisse haren = new Nisse("Haren");
        Nisse skumtomten = new Nisse("Skumtomten");
        Nisse myran = new Nisse("Myran");
        Nisse trötter = new Nisse("Trötter");
        Nisse räven = new Nisse("Räven");
        Nisse glader = new Nisse("Glader");
        Nisse butter = new Nisse("Butter");
        Nisse tomten = new Nisse("Tomten");

        //bosses
        bladlusen.setBoss(myran);
        dammråttan.setBoss(skumtomten);
        skumtomten.setBoss(trötter);
        gråsuggan.setBoss(räven);
        myran.setBoss(räven);
        tröger.setBoss(glader);
        trötter.setBoss(glader);
        blyger.setBoss(glader);
        rådjuret.setBoss(butter);
        nyckelpigan.setBoss(butter);
        haren.setBoss(butter);
        räven.setBoss(butter);
        glader.setBoss(tomten);
        butter.setBoss(tomten);
        tomten.setBoss(null);

        //subordinates
        bladlusen.setSubordinate(null);
        dammråttan.setSubordinate(null);
        gråsuggan.setSubordinate(null);
        tröger.setSubordinate(null);
        blyger.setSubordinate(null);
        rådjuret.setSubordinate(null);
        nyckelpigan.setSubordinate(null);
        haren.setSubordinate(null);
        skumtomten.setSubordinate(Arrays.asList(dammråttan));
        myran.setSubordinate(Arrays.asList(bladlusen));
        trötter.setSubordinate(Arrays.asList(skumtomten));
        räven.setSubordinate(Arrays.asList(myran,gråsuggan));
        glader.setSubordinate(Arrays.asList(tröger, trötter, blyger));
        butter.setSubordinate(Arrays.asList(rådjuret, nyckelpigan, haren, räven));
        tomten.setSubordinate(Arrays.asList(glader, butter));


        myNisses = Arrays.asList(tomten,glader,butter,tröger,trötter,blyger,rådjuret,nyckelpigan,haren,räven,skumtomten,dammråttan,gråsuggan,myran,bladlusen);
    }

    public List <Nisse> getMyNisses(){
        return myNisses;
    }




}
