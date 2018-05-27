package com.example.ebiz.lighthouse;

public class MBTISection {
    private int left1 = 0;
    private int right1 = 0;
    private int left2 = 0;
    private int right2 = 0;
    private int left3 = 0;
    private int right3 = 0;
    private int left4 = 0;
    private int right4 = 0;

    public int addLeft1(){
        return left1++;
    }
    public int addRight1(){
        return right1++;
    }

    public int addLeft2(){
        return left2++;
    }
    public int addRight2(){
        return right2++;
    }

    public int addLeft3(){
        return left3++;
    }
    public int addRight3(){
        return right3++;
    }

    public int addLeft4(){
        return left4++;
    }
    public int addRight4(){
        return right4++;
    }

    public int getLeft1() {return left1;}
    public int getRight1() {
        return right1;
    }

    public int getLeft2() { return left2; }
    public int getRight2() {
        return right2;
    }

    public int getLeft3() {
        return left3;
    }
    public int getRight3() {
        return right3;
    }

    public int getLeft4() {
        return left4;
    }
    public int getRight4() {
        return right4;
    }
}
