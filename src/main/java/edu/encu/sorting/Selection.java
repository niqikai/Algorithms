package edu.encu.sorting;

import edu.princeton.cs.algs4.In;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Selection extends AbstractExample{

    @Override
    void sort( Comparable[] a ) {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if ( less(a[j], a[min] ) ) {
                    min = j;
                }
                exch(a, i, min);
            }
        }
    }

    public static void main(String[] args) {
//        String[] a = new In().readAllStrings();
        String fileName = "/Users/niqikai/Project/algorithms/algs4-data/words3.txt";
        File file =new File(fileName);
        if(!file.exists()) {
            System.out.println("没有文件");

            return;
        }
        List<String> resultStr =new ArrayList<String>();
        try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
            String str =null;
            while(null !=(str=bufferedReader.readLine())) {
                System.out.println(str);
                resultStr.addAll(Arrays.asList(str.split(" ")));
//                resultStr.add(str);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(resultStr);
        String[] a = resultStr.toArray(new String[0]);

        new Selection().sort(a);
        assert isSorted(a);
        show(a);

    }
}
