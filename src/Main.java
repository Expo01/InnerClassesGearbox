import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
//
//        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);       // creation of Gear inner class object using outer class object
//        System.out.println(first.driveSpeed(1000));           // this works if Gear class public and driveSpeed class public
                                                            // but more common to hide the inner class

//        class ClickListener implements Button.OnClickListener {  //this whole ClickListener if if we were using a graphics
                                                                    // framework but we aren't so we simulate the listen method
                                                                    // from the keyboard. this whole concept is just that
                                                // ClickListener is a local class which is defined in a method. Useful when
                                                // we want to define the same object each time?
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() { //this is for anonymous local class. Implements OnClickListener Interface
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}