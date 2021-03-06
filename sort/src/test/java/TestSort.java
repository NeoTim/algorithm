import com.zhangjikai.sort.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangJikai on 2017/2/28.
 */
public class TestSort {


    private List<Integer> randomList;

    @Before
    public void init() {
        int[] arr = new int[]{49, 38, 65, 97, 76, 13, 27, 49};
        arr = new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4,2};
        //arr = new int[]{ 1};
        randomList = new ArrayList<>();
        for (int i : arr) {
            randomList.add(i);
        }

        /*for(int i = 0; i < 100; i++) {
            randomList.add((int)(Math.random() * 1000));
        }*/
    }

    @Test
    public void testInsertSort() {
        Sort<Integer> sort = new InsertSort<>();
        List<Integer> result = sort.sort(randomList);
        System.out.println(result);
    }

    @Test
    public void testShellSort() {
        Sort<Integer> sort = new ShellSort<>();
        List<Integer> result = sort.sort(randomList);
        System.out.println(result);
    }

    @Test
    public void testSelectionSort() {
        Sort<Integer> sort = new SelectionSort<>();
        List<Integer> result = sort.sort(randomList);
        System.out.println(result);
    }

    @Test
    public void testHeapSort() {
        Sort<Integer> sort = new HeapSort<>();
        List<Integer> result = sort.sort(randomList);
        System.out.println(result);
    }

    @Test
    public void testMergeSort() {
        Sort<Integer> sort = new MergeSort<>();
        List<Integer> result = sort.sort(randomList);
        System.out.println(result);
    }
}
