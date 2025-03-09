public class Lamp {
    private boolean isOn;

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public String getStatus(){
        if(isOn){
            return "The lamp is on.";
        }

        return  "The lamp is off.";
    }


}
