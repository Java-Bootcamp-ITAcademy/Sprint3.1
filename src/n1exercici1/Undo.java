package n1exercici1;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Undo {
    private static Undo instance;
    private List<String> listOfCommands;
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    private Undo() {
        listOfCommands = new ArrayList<>();
    }

    public static Undo getInstance() {  //Making Undo singleton
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void getListOfCommands() {
        int i=1;
        ListIterator<String> it= listOfCommands.listIterator(listOfCommands.size());
        while(it.hasPrevious()) {
            System.out.println(i+": "+it.previous());
            i++;
        }

    }

    public void executeCommands() {
        System.out.println("ExecuteAction commands. Press exit to terminate execution");
        String command = "";
        while (!(command = sc.nextLine()).equals("exit")) {
            listOfCommands.add(0,command);
        }
    }

    public void deleteCommand() {
        int positionToDelete;
        System.out.println("Which command do you want to delete?");
        getListOfCommands();
        positionToDelete = Integer.parseInt(sc.nextLine());
        listOfCommands.remove(positionToDelete - 1);
    }

    public static void menu() {
        boolean keepExecution=true;
        String option="";
        while(keepExecution) {
            Undo undo=Undo.getInstance();  //And we'll make sure we only get a single instance
            System.out.println("Choose an option: ");
            System.out.println("1: ExecuteAction commands");
            System.out.println("2: Show commands list");
            System.out.println("3: Delete command from the list");
            System.out.println("0: Terminate program");
            option=sc.nextLine();
            switch (option) {
                case "1": {
                    undo.executeCommands();
                    break;
                }
                case "2": {
                    undo.getListOfCommands();
                    break;
                }
                case "3": {
                    undo.deleteCommand();
                    break;
                }
                case "0": {
                    sc.close();
                    keepExecution=false;
                }
            }
        }
    }
}
