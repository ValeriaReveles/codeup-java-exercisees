package OneNightOut;
// RPG console game, working on name and ending

import java.util.Locale;
import java.util.Scanner;

public class OneNightOut {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
        phoneChoices();
        answerPhone();
        start();
        playerSelection();



    }

    public static void mainMenu() {
        System.out.println("One night out in town, how bad can it be?");
        System.out.print("[START] [EXIT] [HOW TO PLAY]:");
        String mainMenuUserResponse = scanner.nextLine();
        if (mainMenuUserResponse.equalsIgnoreCase("start")) {
            start();
        } else if (mainMenuUserResponse.equalsIgnoreCase("exit")) {

        } else if (mainMenuUserResponse.equalsIgnoreCase("how to play")) {
            System.out.println("""
                    One Night Out is a console based, mini story game.
                    It is quite simple really: you are invited to a fun night out with friends. Should you go or should you stay?
                    Let's see...good times and better drinks? YES PLEASE!
                    After all, how hard can overcoming a little vice be?
                    """);
            System.out.println("--------------------------------");
            System.out.println("Controls:");
            System.out.println("Type:\"forward\": to move forward\nType:\"back\": to move back\nType:\"left\": to move left\nType:\"right\": to move right");
            System.out.println("--------------------------------");
            System.out.println("""
                    Type:"no": to reject a drink or to decline a good time like the nerd you are.
                    Type:"yes": to accept a drink or to live a little. Don't worry, there is no limit to how many you can have or how much you can live.
                    Type:"shut up": to ignore those nagging little voices hanging around.
                    Type:"okay": that's right, come to the dark side. We have candy!""");
            mainMenu();
        } else {
            mainMenu();
        }
    }

    static String playerClass;
    static String playerName;

    public static void start() {
        System.out.println("Alright, let me check my notes. Ah yes!");
        System.out.print("What is your name you?:");
        playerName = scanner.nextLine();
        if (playerName.matches("[a-zA-Z]+$")) {
            playerSelection();
        } else {
            System.out.println("Player name can only contain alphabetical characters a-Z.");
            start();
        }
    }


    static String playerStatus;
    static String userAction;

    public static void playerSelection() {
        System.out.print("What class are you, " + playerName + "?\n\n[BADASS (low DEF high ATK)]\n\n[WIZARD (high DEF low ATK)]\n\n[LOSER (no DEF no ATK]\n\nClass selection:");
        playerClass = scanner.nextLine().toLowerCase(Locale.ROOT); //To obtain correct results for locale insensitive strings
        if (playerClass.equalsIgnoreCase("badass")) {
            System.out.println("""
                    Defense = 50
                    Attack = 20
                    playerStatus = Not you
                    """);
            System.out.println("""
            
            ****************************************************
            Are you sure about that? Please enter a valid class!
            ****************************************************
            
            """);
            playerSelection();
        } else if (playerClass.equalsIgnoreCase("wizard")) {
            System.out.println("""
                    playerDef = 100
                    playerAtk = 0
                    playerStatus = You need to be smart for this class.
                    """);
            System.out.println("""
            ***********************************
            Seriously? I said a VALID class!
            ***********************************
            
            """);
            playerSelection();

        } else {
            System.out.println("""
                    
            ******************************************
            Was there really any other option for you?
            playerDef = 0
            playerAtk = 0
            playerStatus = PERFECT MATCH!
            *******************************************
            
                    """);
            System.out.println("Great! Let's begin shall we?");
            storyStart();
        }
    }


    public static void storyStart() {
        System.out.print("Hold on, is that a whisky bottle in your hands or are you just happy to see me?\n" + playerStatus);
        userAction = scanner.nextLine();
        if (userAction.equalsIgnoreCase("shut up") || userAction.equalsIgnoreCase("no")) {
            System.out.println("Oooofff tough crowd. Fine! Enjoy the silence loser.");
            storyStart();
        } else if (userAction.equalsIgnoreCase("yes") || userAction.equalsIgnoreCase("okay")) {
            System.out.println("Damn I'm funny as hell! HAHAAHAHAH! What's that?");
            answerPhone();
        } else {
            System.out.println("I know words are a hard subject for you, but could you please select valid action?");
            storyStart();
        }
    }

    public static void answerPhone() {
        System.out.println("""
                Is that a phone ringing I hear on a Saturday night?
                Who is it? Is it your friends? Do I sense a fun time coming on?
                Ooooooo how delightful!! Well go on and answer it you bloke!
                """);

        phoneChoices();
    }

    public static void phoneChoices(){
        userAction = scanner.nextLine();
        if (userAction.equalsIgnoreCase("shut up") || userAction.equalsIgnoreCase("yes") || userAction.equalsIgnoreCase("okay")) {
            System.out.println("Me shut up?! Someone is being a precious little cu..");
            System.out.println("Wait come back, I was just kidding! Just answer the damn thing!");
            System.out.println("Oh I just LOVE hearing a phone ring on and on and on and on and on....");
            answerPhone();
        }else if (userAction.equalsIgnoreCase("no")){
            System.out.println("Well then what are we waiting for, answer already!");
            answerPhone();
        }

        //To be continued:
    }
}


