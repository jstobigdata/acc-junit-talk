package c.a.junit.examples;

import java.util.List;

public class DataUtils {
    private List<Integer> data = null;

    public DataUtils(){
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public boolean addData(int d){
        return data.add(d);
    }

    public boolean isPresent(int d){
        return data.contains(d);
    }
}
