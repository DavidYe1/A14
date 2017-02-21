/**
 * Created by @Autor DavidYe on @Version 16.02.2017.
 */
public class UhrModel {
    public int getStunde() {
        return stunde;
    }

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int stunde = 00;
    public int minute = 00;

    public void increaseMin() {
        if (this.minute < 59) {
            this.minute++;
        } else {
            this.minute = 00;
        }
    }

    public void increaseH() {
        if (this.stunde < 23) {
            this.stunde++;
        } else {
            this.stunde = 00;
        }
    }
}
