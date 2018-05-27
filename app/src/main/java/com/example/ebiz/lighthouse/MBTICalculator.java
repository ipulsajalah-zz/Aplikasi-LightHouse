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

    public String getResult(){
        StringBuilder output = new StringBuilder();
        String section1 = EI.getLeft() > EI.getRight() ? "E" : "I";
        String section2 = SN.getLeft() > SN.getRight() ? "S" : "N";
        String section3 = TF.getLeft() > TF.getRight() ? "T" : "F";
        String section4 = JP.getLeft() > JP.getRight() ? "J" : "P";

        output.append(section1)
                .append(section2)
                .append(section3)
                .append(section4);

        return output.toString();
    }

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
        if(EI.getLeft() != EI.getRight()) this.EI = EI;
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
        if(SN.getLeft() != SN.getRight()) this.SN = SN;
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
        if(TF.getLeft() != TF.getRight()) this.TF = TF;
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
        if(JP.getLeft() != JP.getRight()) this.JP = JP;
    }


    public static void main(String[] args) {
        MBTISection section1 = new MBTISection();
        // pencet kanan
        section1.addRight();
        // pencet kiri
        section1.addLeft();

        // bikin sampai section 4
        MBTISection section2 = new MBTISection();
        MBTISection section3 = new MBTISection();
        MBTISection section4 = new MBTISection();


        // begitu seterusnya
        // terakhir :
        MBTICalculator mbtiCalculator = new MBTICalculator();
        mbtiCalculator.setEI(section1);
        mbtiCalculator.setSN(section2);
        mbtiCalculator.setTF(section3);
        mbtiCalculator.setJP(section4);
        // liat hasil panggil method getResult
        mbtiCalculator.getResult();

    }
}
