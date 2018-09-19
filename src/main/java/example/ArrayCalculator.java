package example;

import java.util.ArrayList;
import java.util.List;

public class ArrayCalculator {

    private static List<Integer> integerList = new ArrayList<Integer>();

    public ArrayCalculator()
    {

    }

    /**
     * Constructor
     * @param list
     */
    public ArrayCalculator(List<Integer> list)
    {
        integerList = list;
    }

    public void addIntegerToList(int integer)
    {
        integerList.add(integer);
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }


    public int getWholeListAdded()
    {
        return getWholeListAddedWithFactor(0);
    }

    public int getWholeListAddedWithFactor(int factor)
    {
        int sum = 0;

        for(int integer : integerList) {
            sum += integer + factor;
        }

        return sum;
    }
}
