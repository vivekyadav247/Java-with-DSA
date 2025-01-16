import java.util.*;
import java.util.Comparator;
public class FractionalKnapSacks {
    static class ItemValue {

        int profit, weight;

        // Item value function
        public ItemValue(int val, int wt)
        {
            this.weight = wt;
            this.profit = val;
        }
    }

    private static double getMaxValue(ItemValue[] arr, int capacity) {
        // Sorting items by profit/weight ratio;
        Arrays.sort(arr, new Comparator<ItemValue>() {
            public int compare(ItemValue item1, ItemValue item2) {
                double cpr1
                        = new Double((double) item1.profit
                        / (double) item1.weight);
                double cpr2
                        = new Double((double) item2.profit
                        / (double) item2.weight);

                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });

        double totalValue = 0d;

        for (ItemValue i : arr) {

            int curWt = (int) i.weight;
            int curVal = (int) i.profit;

            if (capacity - curWt >= 0) {

                // This weight can be picked whole
                capacity = capacity - curWt;
                totalValue += curVal;
            } else {

                // Item cant be picked whole
                double fraction
                        = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                capacity
                        = (int) (capacity - (curWt * fraction));
                break;
            }
        }

        return totalValue;
    }
    public static void main(String[] args) {
        int val[] = {7, 2, 2, 7, 7, 6, 1, 3, 7, 2};
        int wt[] = {7, 2, 7, 5, 6, 6, 2, 7, 5, 7};
        int capacity = 27 ;
        int n = wt.length ;
        ItemValue[] arr = new ItemValue[n];
        for(int i=0; i<n; i++){
            arr[i] = new ItemValue(val[i],wt[i]);
        }
        double ans = getMaxValue(arr,capacity);
        System.out.println(ans);
    }
}
