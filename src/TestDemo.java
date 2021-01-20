import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-01-08
 * Time: 11:12
 * Project: Inlämningsuppgift 2 Rekursion
 * Copyright: MIT
 */
public class TestDemo {

    public static NisseUtil database = new NisseUtil();
    public static List<Nisse> nisses = database.getMyNisses();



    //"Anger en nisses namn och får tillbaka en lista av alla denna nisses chefer, på samtliga nivåer."
    private static List<String> fetchMyBoss(String nisseNamn){
        List <String> samladeNamn = new ArrayList<>();
        for (Nisse nisse : nisses) {
            if (nisse.getName().equalsIgnoreCase(nisseNamn)) {
                samladeNamn.addAll(addAllMappedBosses(nisse));
            }

        }
        return samladeNamn;


    }
    private static List<String> addAllMappedBosses(Nisse nisse) {
        List<String> namesOfBosses = new ArrayList<>();
        if (nisse.getBoss() == null) { return  namesOfBosses;}
        else{
            namesOfBosses.add(nisse.getBoss().name); // lägger till nuvarande boss
            namesOfBosses.addAll(addAllMappedBosses(nisse.getBoss())); //anropar recursive, arbetar sig genom bossar som är mappade
        }
        return namesOfBosses;
    }



    //"Anger en nisses namn och får tillbaka en lista på alla dess underordnade, på samtliga nivåer."
    private static List<String> fetchMySubordinates(String nisseNamn){
       List <String> samladeNamn = new ArrayList<>();
        for (Nisse nisse : nisses) {
            if (nisse.getName().equalsIgnoreCase(nisseNamn)) {
                samladeNamn.addAll(addAllMappedSubordinates(nisse));
            }

        }
        return samladeNamn;


    }
    private static List<String> addAllMappedSubordinates(Nisse nisse) {
        List<String> subordinateNamn = new ArrayList<>();
        if (nisse.subordinate == null || nisse.subordinate.isEmpty()) {
            return subordinateNamn;
        } else
            for (Nisse subordinates : nisse.subordinate) {
                subordinateNamn.add(subordinates.name); // lägger till nuvarande subordinate(s)
                subordinateNamn.addAll(addAllMappedSubordinates(subordinates)); //anropar recursive, arbetar sig genom subordinates som är mappade
            }

        return subordinateNamn;
    }





    TestDemo(){

        System.out.println(fetchMySubordinates("Räven"));
        System.out.println(fetchMyBoss("Dammråttan"));

    }

    public static void main(String[] args) {
        TestDemo td1 = new TestDemo();
    }
}
