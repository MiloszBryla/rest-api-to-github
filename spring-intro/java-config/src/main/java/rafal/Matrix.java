package rafal;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

    public Matrix(Quarter quarter) {
        quarterList.add(quarter);
    }

    public List<Quarter> getQuarterList() {
        return quarterList;
    }
    private List<Quarter> quarterList = new ArrayList<>();
}
