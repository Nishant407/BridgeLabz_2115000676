import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeDisplay {
    public static void main(String[] args) {
        displayTime("GMT");
        displayTime("Asia/Kolkata"); // IST
        displayTime("America/Los_Angeles"); // PST
    }
    
    public static void displayTime(String zone) {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println("Current time in " + zone + ": " + currentTime);}}
