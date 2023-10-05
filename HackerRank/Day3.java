public class Day3 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("07:05:45PM");

        // Check if the time is in PM
        if (s.toString().contains("PM")) {
            // Extract the hours, minutes, and seconds
            int hours = Integer.parseInt(s.substring(0, 2));
            int minutes = Integer.parseInt(s.substring(3, 5));
            int seconds = Integer.parseInt(s.substring(6, 8));

            // Convert to 24-hour format
            if (hours < 12) {
                hours += 12;
            }

            // Update the StringBuilder with the new time
            s.replace(0, 8, String.format("%02d:%02d:%02d", hours, minutes, seconds));
        }

        // Print the result
        System.out.println(s.toString());
    }
}
