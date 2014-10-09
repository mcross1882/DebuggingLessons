package mcross1882.debuggers;

public class WatchAndListenDemo {

    public static void main(String[] args) {
        User user = new User();
        
        user.setFirstName(args[0]);
        user.setLastName(args[1]);
        user.setAge(Integer.parseInt(args[2]));
        
        System.out.println(user);
    }
}

