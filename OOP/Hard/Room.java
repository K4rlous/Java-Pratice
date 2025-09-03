package Hard;

public class Room {
    private int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        if(roomNumber > 0 ){
            this.roomNumber = roomNumber;
        } else {
            System.out.println("[ERROR] Invalid room number!");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + (isAvailable ? " (Available)" : " (Occupied)");
    }

}
