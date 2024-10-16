package UTS;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String[] doc;

    UserProfile(int user_id, String password, String name, int age, String email_id) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;

        this.doc = new String[] {

        };
    }

    public int getUserId() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return email_id;
    }

    public void show_document() {
        System.out.println("User_id : " + user_id);
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
        System.out.println("Email_id :" + email_id);

        for (String docs : doc) {
            System.out.println(docs);
        }
    }

}
