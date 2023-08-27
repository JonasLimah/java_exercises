package section_10.OOP;

public class Tenant {
    private String name;
    private String email;
    private int room;
    public Tenant(String name,String email,int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    public String toString(){
        return getRoom()+": "+ getName()+", "+getEmail();
    }
}
