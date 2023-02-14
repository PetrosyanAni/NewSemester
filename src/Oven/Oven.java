package Oven;

public class Oven {
    private int gasCooktop = 3;
    private int elCooktop = 3;
    private boolean gasCooktopState = false;
    private boolean elCooktopState = false;
    private int gasPower = 100;
    private int elPower = 80;


    Oven(int elCooktop, int gasCooktop) {
        if (gasCooktop >= 3 && gasCooktop <=5) {
            this.elCooktop = elCooktop;
        }
        if (elCooktop >= 1 && elCooktop <= 3) {
            this.gasCooktop = gasCooktop;
        }
    }

    public void setGasCooktopState(boolean gasCooktopState) {
        this.gasCooktopState = gasCooktopState;
    }
    public void setElCooktopState(boolean elCooktopState) {
        this.elCooktopState = elCooktopState;
    }
    int sumPower (){
      int sumPower =  (this.gasCooktop *  gasPower) + (this.elCooktop* elPower);
      if (this.elCooktopState=false){
          this.elCooktop=0;
      }
      if (this.gasCooktopState=false){
          this.elCooktop=0;
      }
        System.out.println(sumPower);
        return sumPower;
    }

}





