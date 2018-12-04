package bullsandcows.sample;

import javafx.scene.control.Spinner;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;


import java.util.*;

public class Controller {
    public Spinner<Integer> n1Spinner;
    public Spinner<Integer> n2Spinner;
    public Spinner<Integer> n3Spinner;
    public Spinner<Integer> n4Spinner;
    public TableView<Turn> resultTable;
    private int nr = 1;
    private static ArrayList<Integer> rand = new ArrayList<>();


    public void initialize() {
        Random r = new Random();
        while (rand.size() < 4) {
            int n = r.nextInt(10);
            rand.add(n);

        }
        System.out.println(rand);
    }


    public void dogo(ActionEvent actionEvent) {

        Turn t = new Turn();
        t.setNr(nr);
        nr++;

        t.setN1(n1Spinner.getValue());
        t.setN2(n2Spinner.getValue());
        t.setN3(n3Spinner.getValue());
        t.setN4(n4Spinner.getValue());


        t.setCows(Cows(n1Spinner.getValue(),
                n2Spinner.getValue(),
                n3Spinner.getValue(),
                n4Spinner.getValue()));
        t.setBulls(Bulls(n1Spinner.getValue(), n2Spinner.getValue(),
                n3Spinner.getValue(), n4Spinner.getValue()));

        resultTable.getItems().add(t);

    }

    public static int Cows(int n1, int n2, int n3, int n4) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(n1);
        nums.add(n2);
        nums.add(n3);
        nums.add(n4);

        int cows = 0;
        for (Integer s : rand) {
            for (Integer a : nums) {
                if (s == a) cows++;
            }
        }
        return cows;
    }

    public static int Bulls(int n1, int n2, int n3, int n4) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(n1);
        nums.add(n2);
        nums.add(n3);
        nums.add(n4);


        int bulls = 0;
        for (int i = 0; i < rand.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (rand.get(i) == nums.get(j) && i == j) bulls++;
            }
        }

        return bulls;
    }

}





