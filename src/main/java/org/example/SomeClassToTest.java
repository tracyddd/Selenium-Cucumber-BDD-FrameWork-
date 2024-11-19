package org.example;

public class SomeClassToTest {

    public int sumNumbers(int a, int b) {
        return a + b;
    }
    public String addStrings(String str1, String str2) {
        return str1 + " " + str2; // Concatenate with a space in between
    }

    public int[] getArray() {
        return new int[] { 1, 2, 3};
    }

    /*
        public int[] getArray() {
        int[] arrayExample ={ 1, 2, 3};
    return arrayExample;
    }*/

}
