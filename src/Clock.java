public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    public void addMinutes(int minutes){
        this.hour += ((this.minute + minutes) / 60);
        this.hour = (this.hour % 24);

        this.minute = ((this.minute + minutes) % 60);
    }

    public void displayTime(){
        System.out.println(this.hour + ":" + this.minute);
    }
}
