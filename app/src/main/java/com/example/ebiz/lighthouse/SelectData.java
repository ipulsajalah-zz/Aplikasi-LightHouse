package com.example.ebiz.lighthouse;

public class SelectData {
    private int left = 0;
    private int right = 0;

    public int addLeft(){
        return left++;
    }

    public int addRight(){
        return right++;
    }

    /**
     * @return the left
     */
    public int getLeft() {
        return left;
    }


    /**
     * @return the right
     */
    public int getRight() {
        return right;
    }
}
