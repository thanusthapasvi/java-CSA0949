import java.util.ArrayList;
import java.util.List;

class ExamRoom {
    private int n;
    private List<Integer> seats;

    public ExamRoom(int n) {
        this.n = n;
        this.seats = new ArrayList<>();
    }

    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0);
            return 0;
        }
        
        int maxDistance = 0, seat = 0;
        int prev = -1;
        
        for (int i = 0; i < seats.size(); i++) {
            int currDistance;
            if (i == 0) {
                currDistance = seats.get(i) - 0;
            } else {
                currDistance = (seats.get(i) - seats.get(i - 1)) / 2;
            }
            
            if (currDistance > maxDistance) {
                maxDistance = currDistance;
                seat = (i == 0) ? 0 : seats.get(i - 1) + currDistance;
            }
        }
        
        if (n - 1 - seats.get(seats.size() - 1) > maxDistance) {
            seat = n - 1;
        }
        
        seats.add(seat);
        return seat;
    }

    public void leave(int p) {
        seats.remove(Integer.valueOf(p));
    }
}

public class ExamRoomSimulation {
    public static void main(String[] args) {
        ExamRoom examRoom = new ExamRoom(10);
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        examRoom.leave(4);
        System.out.println(examRoom.seat());
    }
}
