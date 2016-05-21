package com.shiloa.Interviews;

import java.util.*;

class ArraysAndStrings {

    /**
     * Determine if a string has all unique characters
     * @param String str
     * @return Boolean whether the string is unique
     */
    static boolean isAllUniqueCharacters(String str) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (chars.containsKey(c)) {
                return false;
            }

            chars.put(c, 1);
        }

        return true;
    }

    /**
     * Determins whether a given string is a permutation of another
     * @param str1
     * @param str2
     * @return bool
     */
    static boolean isPermutation(String str1, String str2) {

        // the "easy" way is to sort both strings and check
        // if they're equal... But let's use HashMaps instead!

        // fail immediately if strings aren't of equal length
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> chars1 = new HashMap<>();
        HashMap<Character, Integer> chars2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (!chars1.containsKey(c)) {
                // initialize the character key
                chars1.put(c, 1);
            } else {
                // increment the character count
                chars1.put(c, chars1.get(c) + 1);
            }
        }

        for (char c : str2.toCharArray()) {
            // here we can fail early if the other map
            // doesn't contain the character
            if (!chars1.containsKey(c)) {
                return false;
            }

            if (!chars2.containsKey(c)) {
                chars2.put(c, 1);
            } else {
                // we could also fail early-ish here if
                // the count for this map is greater than
                // the other
                if (chars1.get(c) <= chars2.get(c)) {
                    return false;
                }

                chars2.put(c, chars2.get(c) + 1);
            }
        }

        // finally compare both counts in the string
        for (char c : chars1.keySet()) {
            if (chars1.get(c) != chars2.get(c)) {
                return false;
            }
        }

        return true;
    }

    /**
     *
     * @param input - the input string to manipulate
     * @return the modified string
     */
    String replaceSpacesInString(String input) {
        char[] output = input.toCharArray();

        for (int i = 0; i < output.length ; i++) {
            if (output[i] == ' ') {
                // TODO: FIXME
                return "TODO";
            }
        }

        return Arrays.toString(output);
    }
}
