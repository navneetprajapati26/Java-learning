package oops;

//import strings_day_6_9 strings;

public class miniProject {
    public static void main(String[] args) {
        Subject Daa = new Subject();
        Daa.setId("KSC501");
        Daa.setSubName("DAA");
        Daa.setPassword("123456");
        System.out.println(Daa.id);
        System.out.println(Daa.subName);
        // System.out.println(Daa.password);
    }

}

class Subject {
    String id;
    String subName;
    private String password;

    public void setId(String id) {
        this.id = id;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}