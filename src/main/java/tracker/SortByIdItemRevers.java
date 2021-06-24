package tracker;

import java.util.Comparator;

public class SortByIdItemRevers implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return second.getId() .compareTo(first.getId());
    }
}
