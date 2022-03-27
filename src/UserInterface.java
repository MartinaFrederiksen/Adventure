public class UserInterface {

  public void soutPrinter(String text) throws InterruptedException {

    for (int i = 0; i <= text.length() - 1; i++) {
      System.out.print(text.charAt(i));
      Thread.sleep(20);
    }
    System.out.println();
  }

    public void Introduction () throws InterruptedException {
      soutPrinter("Welcome to the house of horrors, where many obstacles awaits \nOBS: Write help to receives clues");
    }

    public void helpMenu () {
    System.out.print("Help Menu:");
    System.out.println("Write Look: to get the current description of your current room");
    System.out.println("Write Exit: to Quit game");
    System.out.println("Write Help: to get game directions");

  }
}
