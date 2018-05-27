package com.example.ebiz.lighthouse;

public class MBTISection {
    private int left;
    private int right;

    public int addLeft(){
        return left++;
    }
    public int addRight(){
        return right++;
    }

    public int getLeft() {return left;}
    public int getRight() {return right;}

}
