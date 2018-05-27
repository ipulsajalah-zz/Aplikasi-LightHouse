package com.example.ebiz.lighthouse;

import android.util.Log;

public class MBTICalculator {
    // Extrovert vs Introvert
    private MBTISection EI;
    // Sensing vs iNtuition
    private MBTISection SN;
    // Thinking vs Feeling
    private MBTISection TF;
    // Judging vs Perceiving
    private MBTISection JP;

    /**
     * @return the EI
     */
    public MBTISection getEI() {
        return EI;
    }

    /**
     * @param EI the EI to set
     */
    public void setEI(MBTISection EI) {
        if(EI.getLeft1() != EI.getRight1()) this.EI = EI;
    }

    /**
     * @return the SN
     */
    public MBTISection getSN() {
        return SN;
    }

    /**
     * @param SN the SN to set
     */
    public void setSN(MBTISection SN) {
        if(SN.getLeft2() != SN.getRight2()) this.SN = SN;
    }

    /**
     * @return the TF
     */
    public MBTISection getTF() {
        return TF;
    }

    /**
     * @param TF the TF to set
     */
    public void setTF(MBTISection TF) {
        if(TF.getLeft3() != TF.getRight3()) this.TF = TF;
    }

    /**
     * @return the JP
     */
    public MBTISection getJP() {
        return JP;
    }

    /**
     * @param JP the JP to set
     */
    public void setJP(MBTISection JP) {
        if(JP.getLeft4() != JP.getRight4()) this.JP = JP;
    }

    public String getResult(){
        StringBuilder output = new StringBuilder();
        String section1 = EI.getLeft1() > EI.getRight1() ? "E" : "I";
        String section2 = SN.getLeft2() > SN.getRight2() ? "S" : "N";
        String section3 = TF.getLeft3() > TF.getRight3() ? "T" : "F";
        String section4 = JP.getLeft4() > JP.getRight4() ? "J" : "P";

        output.append(section1)
                .append(section2)
                .append(section3)
                .append(section4);

        return output.toString();
    }

    public static void main(String[] args) {
        MBTISection section1 = new MBTISection();
        section1.addRight1();
        section1.addLeft1();
        MBTISection section2 = new MBTISection();
        section2.addRight2();
        section2.addLeft2();
        MBTISection section3 = new MBTISection();
        section3.addRight3();
        section3.addLeft3();
        MBTISection section4 = new MBTISection();
        section4.addRight4();
        section4.addLeft4();
        MBTICalculator mbtiCalculator = new MBTICalculator();
        mbtiCalculator.setEI(section1);
        mbtiCalculator.setSN(section2);
        mbtiCalculator.setTF(section3);
        mbtiCalculator.setJP(section4);

        mbtiCalculator.getResult();
        Log.d("hasil", String.valueOf(mbtiCalculator.getSN()));
    }
}
