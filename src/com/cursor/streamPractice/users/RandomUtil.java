package com.cursor.streamPractice.users;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class RandomUtil {
    private static final Random RANDOM = new Random();
    private static final int DAYS_IN_MONTH = 30;
    private static final Date START_DATE = new Date(2019, 0, 1);

    public static User getRandomUser() {
        return new User(getRandomEmail(), getRandomDate(), getRandomTeam());
    }

    private static String getRandomEmail() {
        return RANDOM.nextInt(Integer.MAX_VALUE) + "@cursor.edu";
    }

    private static Team getRandomTeam() {
        switch (RANDOM.nextInt(3)) {
            case 0:
                return Team.INSTINCT;
            case 1:
                return Team.VALOR;
            default:
                return Team.MYSTIC;
        }
    }

    private static Date getRandomDate() {
        GregorianCalendar gc = new GregorianCalendar();
        gc.roll(Calendar.DAY_OF_YEAR, -RANDOM.nextInt(DAYS_IN_MONTH));
        return gc.getTime();
    }
}
