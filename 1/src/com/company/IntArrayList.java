package com.company;

public class IntArrayList implements IntList {

    private int startSize = 10;
    private int count = 0;
    private int[] arr = new int[startSize];

    public IntArrayList() {
    }

    private void expandArr() {
        int[] newArr = new int[arr.length * 3 / 2 + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    private void rightShift(int index) {
        for (int i = count; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

    }

    private void leftShift(int index) {
        for (int i = index; i <= count; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public void add(int value) {
        if (arr.length > count) {
            arr[count] = value;
            count++;
        } else {
            expandArr();
            arr[count] = value;
            count++;
        }
    }

    public void add(int index, int value) {
        if (arr.length > count) {
            rightShift(index);
            arr[index] = value;
            count++;
        } else {
            expandArr();
            rightShift(index);
            arr[index] = value;
            count++;
        }
    }

    public void remove(int index) {
        leftShift(index);
        count--;
    }

    public void clear() {
        count = 0;
    }

    public boolean contains(int value) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return count;
    }

}
