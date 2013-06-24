/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csvwriter;

/**
 *
 * @author John
 */
public class TrainingDataLine {
    double us1;
    double us2;
    double us3;
    double us4;
    double us5;
    double us6;
    double gyroAngle;
    double accel1;

    double rightOut;
    double leftOut;
    
    public TrainingDataLine(double [] in){
        us1 =in[0];
        us2=in[1];
        us3=in[2];
        us4=in[3];
        us5=in[4];
        us6=in[5];
        gyroAngle=in[6];
        accel1=in[7];

        rightOut=in[8];
        leftOut=in[9];        
    }

    public double getAccel1() {
        return accel1;
    }

    public void setAccel1(double accel1) {
        this.accel1 = accel1;
    }

    public double getGyroAngle() {
        return gyroAngle;
    }

    public void setGyroAngle(double gyroAngle) {
        this.gyroAngle = gyroAngle;
    }

    public double getLeftOut() {
        return leftOut;
    }

    public void setLeftOut(double leftOut) {
        this.leftOut = leftOut;
    }

    public double getRightOut() {
        return rightOut;
    }

    public void setRightOut(double rightOut) {
        this.rightOut = rightOut;
    }

    public double getUs1() {
        return us1;
    }

    public void setUs1(double us1) {
        this.us1 = us1;
    }

    public double getUs2() {
        return us2;
    }

    public void setUs2(double us2) {
        this.us2 = us2;
    }

    public double getUs3() {
        return us3;
    }

    public void setUs3(double us3) {
        this.us3 = us3;
    }

    public double getUs4() {
        return us4;
    }

    public void setUs4(double us4) {
        this.us4 = us4;
    }

    public double getUs5() {
        return us5;
    }

    public void setUs5(double us5) {
        this.us5 = us5;
    }

    public double getUs6() {
        return us6;
    }

    public void setUs6(double us6) {
        this.us6 = us6;
    }

    @Override
    public String toString() {
        return "TrainingDataLine{" + "us1=" + us1 + ", us2=" + us2 + ", us3=" + us3 + ", us4=" + us4 + ", us5=" + us5 + ", us6=" + us6 + ", gyroAngle=" + gyroAngle + ", accel1=" + accel1 + ", rightOut=" + rightOut + ", leftOut=" + leftOut + '}';
    }
    
    
    
    
}
