package edu.hw1;


public class Task1 {
    public static int videoLengthInSeconds(String time) {
        String[] parts = time.split(":");

        if (parts.length != 2) {
            return -1;
        }

        try {
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);

            if (seconds >= 60) {
                return -1;
            }

            if (minutes < 0) {
                return -1;
            }


            return (minutes * 60) + seconds;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(videoLengthInSeconds("12:44"));
    }
}