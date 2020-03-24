//Shengnan You
//112361646
//CSE 114
//Lab#10
import java.util.ArrayList;
import java.util.Scanner;

public class TeamManager{
    public static void main(String[] args) {
        int choice=0;
        ArrayList<Player> list = new ArrayList<>();
        while (choice!=5) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Print player list.");
            System.out.println("2. Add player to roster.");
            System.out.println("3. Remove player from roster.");
            System.out.println("4. Change player's position.");
            System.out.println("5. Quit.");
            System.out.print("Enter  menu choice： ");
            Scanner butter = new Scanner(System.in);
            choice = butter.nextInt();
            if (choice == 5) System.exit(0);
            else if (choice == 2) {
                System.out.print("Enter player name: ");
                String name = butter.next();
                System.out.print("Enter player position (1 = defender, "
                        + "2 = midfielder, 3 = forward): ");
                int positionNumber = butter.nextInt();

                switch (positionNumber) {
                    case 1: {
                        Player member = new Player(name, Position.DEFENDER);
                        list.add(member);
                        break;
                    }
                    case 2: {
                        Player member = new Player(name, Position.MIDFIELDER);
                        list.add(member);
                        break;
                    }
                    case 3: {
                        Player member = new Player(name, Position.FORWARD);
                        list.add(member);
                        break;
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter name of player to remove:  ");
                String removed = butter.next();
                for (int i = 0; i < list.size(); i++) {
                    Player obj = list.get(i);
                    if (removed.equals(obj.getName()))
                        list.remove(list.remove(i));
                }
            } else if (choice == 1) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).toString());
                }

        }

            else if(choice==4){
                System.out.print("Enter name of player to reposition: ");
                String revise=butter.next();
                System.out.print("Enter new position (1 = defender, 2 = midfielder, 3 = forward):");
                int reviseTo=butter.nextInt();
                for(int i=0;i<list.size();i++) {
                    Player obj = list.get(i);
                    if(revise.equals(obj.getName())) {
                        switch (reviseTo) {
                            case 1:
                            obj.setPosition(Position.DEFENDER);break;
                            case 2:
                            obj.setPosition(Position.MIDFIELDER);break;
                            case 3:
                            obj.setPosition(Position.FORWARD);break;
                        }
                    }
                }


            }


        }
    }








    }


enum Position {DEFENDER, MIDFIELDER, FORWARD};

class Player {
    public Player(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    private String name;
    private Position position;

    public String getName() {
        return name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {

        return getName()+": "+position;
    }
}