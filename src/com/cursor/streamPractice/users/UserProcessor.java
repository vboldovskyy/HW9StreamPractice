package com.cursor.streamPractice.users;

import java.util.*;
import java.util.stream.Collectors;

public class UserProcessor {

    public Map<Team, List<String>> filterUsers(List<User> userList) {
        GregorianCalendar weekAgo = new GregorianCalendar();
        weekAgo.add(Calendar.WEEK_OF_YEAR, -1);
        return userList.stream()
                .filter(user -> user.getLoginDate().getTime() > weekAgo.getTime().getTime())
                .collect(Collectors.groupingBy(User::getTeam,
                        Collectors.mapping(User::getEmail, Collectors.toList())));
    }

    public List<User> generateUserList(int userNumber) {
        List<User> result = new ArrayList<>();
        for (int i = 0; i < userNumber; i++) {
            result.add(RandomUtil.getRandomUser());
        }
        return result;
    }
}
