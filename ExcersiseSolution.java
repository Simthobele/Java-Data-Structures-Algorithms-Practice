/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excersisesolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author peter
 */
public class ExcersiseSolution {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            array.add(10 + random.nextInt(31));
        }
        //Display the generated array on the console
        System.out.println("Generated array: "+ array);
        
        //sort the array and display it on the console
        Collections.sort(array);
        System.out.println("Sorted array: "+array);
        
        //Remove duplicates(repeated numbers) from the array
        Set<Integer> uniqueSet = new HashSet<>(array);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        Collections.sort(uniqueList);
        System.out.println("Array without duplicates: "+ uniqueList);
        
        //Determine the sum and avarage of the array elements
        int sum = 0;
        for(int num: array)
        {
            sum+= num;
        }
        double avarage = (double)sum/array.size();
        System.out.println("Sum:"+sum);
        System.out.println("Average: "+avarage);
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num: array)
        {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        System.out.println("Element Occurrences in the original array:");
        for(int key: countMap.keySet())
        {
            System.out.println(key+":"+ countMap.get(key));
        }
    }
}
