package ru.job4j.tracker.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        try {
            for (User user : users) {
               if (user.getUsername().equals(login)) {
                   return user;
               }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } return null;
    }
    public static boolean validate(User user) throws UserInvalidException {
        try {
            if (user.isValid() || user.getUsername().length() >= 3) {
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (validate(users[0])) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}
