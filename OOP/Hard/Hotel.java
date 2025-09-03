package Hard;

import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Reservation bookRoom(String guestName) throws NoRoomAvailableException{
        for(Room room : rooms){
            if (room.isAvailable()){
                Reservation reservation = new Reservation(guestName, room);
                room.setAvailable(false);
                return reservation;
            }

        }
        throw new NoRoomAvailableException("[ERROR] No rooms available");
    }

    public void cancelReservation(Reservation reservation){
        Room room = reservation.getRoom();
        room.setAvailable(true);
        System.out.println("Reservation for: " + reservation.getGuestName() +
                " in room: " + room.getRoomNumber() + " has been cancelled!");
    }



    public void showAvailableRooms(){
        for(Room room: rooms){
            if(room.isAvailable()){
                System.out.println("The Room: " + room.getRoomNumber() + " is available!");
            }
        }
    }
}
