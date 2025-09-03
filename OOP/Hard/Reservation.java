package Hard;

public class Reservation {
    private String guestName;
    private Room room;

    public Reservation(String guestName, Room room) {
        this.guestName = guestName;
        this.room = room;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        if(guestName == null || guestName.isEmpty()){
            System.out.println("[ERROR] Type a valid guest name!");
        } else {
            this.guestName = guestName;
        }
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
