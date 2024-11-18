import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WaitingListManager {
    private Queue<String> waitingList;
    private Set<String> uniqueNames;

    public WaitingListManager() {
        waitingList = new LinkedList<>();
        uniqueNames = new HashSet<>();
    }

    void addPerson(String name){
        if(uniqueNames.contains(name)){
            System.out.println("This person already exists");
        }else{
            waitingList.offer(name);
            uniqueNames.add(name);
            System.out.println(name + " has been added to the waiting list.");
        }
    }

    String servePerson(){
        if(waitingList.isEmpty()){
            return "The waiting list is empty";
        }else{
            String servedPerson = waitingList.poll();
            uniqueNames.remove(servedPerson);
            return servedPerson + " has been served.";
        }
    }

    // Next person to be served
    String nextServePerson(){
        if(waitingList.isEmpty()){
            return "The waiting list is empty";
        }else{
            String nextPerson = waitingList.peek();
           return "Next person on the list: " + nextPerson;
        }
    }

   boolean isPersonInList(String name){
        // check in set because set does not allow duplicates => faster checking time
        return uniqueNames.contains(name);
    }

    int waitingListSize(){
        return waitingList.size();
    }

    public void displayWaitingList() {
        if (waitingList.isEmpty()) {
            System.out.println("Waiting list is empty.");
        } else {
            System.out.println("Waiting List: " + String.join(", ", waitingList));
        }
    }


}
