package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        /* to be implemented in part (a) */
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length; i++) {
            String word1 = words[i];
            for (int k = i+1; k < words.length; k++) {
               String word2 = words[k];
               allPairs.add(new WordPair(word1,word2));
            }
         }
         
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int count = 0;
        for (WordPair pair : allPairs) {
            if (pair.getFirst().equals(pair.getSecond())) {
               count++;
            }
         }
         return count;         
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
