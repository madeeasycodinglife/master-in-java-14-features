package com.madeeasy.switchjep361;

public class Main {
    public static void main(String[] args) {
        boolean isTodayHolidayOld;
        String day = "SUNDAY";
// this is the old style of switch statement
        boolean result;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isTodayHolidayOld = false;
                result = isTodayHolidayOld;
                break;
            case "SATURDAY":
            case "SUNDAY":
                isTodayHolidayOld = true;
                result = isTodayHolidayOld;
                break;
            default:
                throw new IllegalArgumentException("What's a " + day);
        }
        System.out.println("result = " + result);


// new style of switch statement
        boolean isTodayHolidayUpdated = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };
        System.out.println("isTodayHolidayUpdated = " + isTodayHolidayUpdated);

    }
}
