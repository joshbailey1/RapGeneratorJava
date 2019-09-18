import java.io.Console;

public class RapGenerator {

  public static void main(String[] args) {
    Console console = System.console();
    //Welcome to the introductions program! Your code goes below here
    String name = console.readLine("What is your rap name?   ");
    String groupOfFriends = console.readLine("Enter a name for a group of friends (i.e peeps, homies)   ");
    String adjectiveOne = console.readLine("Enter a good adjective of the highest order (bestest, coolest)   ");
    String adjectiveTwo = console.readLine("Enter a good adjective that is superior (better, cooler)   ");
    int age = 0;
    Boolean isValidAge;
    do {
      String ageAsString = console.readLine("Enter your age in years   ");
      try {
        age = Integer.parseInt(ageAsString);
        isValidAge = true;
      } catch (NumberFormatException e) {
        System.out.println("Input is not a valid integer age  \n");
        isValidAge = false;
      }
    } while (!isValidAge);
    String ageInWeeks = String.valueOf(age * 52);
    String hometown = console.readLine("Enter your hometown   ");
    String verbOne = console.readLine("Enter a verb ending in ING   ");
    String verbTwo = console.readLine("Enter a verb ending in ING   ");
    String verbThree = console.readLine("Enter a verb ending in ING   ");
    String favouritePerson = console.readLine("Enter your favourite person, living or dead famous or not   ");
    String adjectiveThree = console.readLine("Enter an adjective   ");
    String gender;
    Boolean isValidGender;
    do {
      gender = console.readLine("Enter your gender (m/f)   ");
      isValidGender = (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f"));
      if (!isValidGender) {
        console.printf("You need to enter m or f\n");
      }
    } while (!isValidGender);
    String genderOptionOne;
    String genderOptionTwo;
    String genderOptionThree;
    if (gender.equalsIgnoreCase("m")) {
      genderOptionOne = "rude dude";
      genderOptionTwo = "He's";
      genderOptionThree = "guy";
    } else {
      genderOptionOne = "cool chick";
      genderOptionTwo = "She's";
      genderOptionThree = "girl";
    }
    console.printf("Your rap:  \n------------------\n");
    console.printf("Now listen up %s I got the word\n", groupOfFriends);
    console.printf("It's that %s %s haven't you heard?\n", genderOptionOne, name);
    console.printf("%s the %s, illest, take a look around\n", genderOptionTwo, adjectiveOne);
    console.printf("You won't find a %s %s out there, that's the true sound.\n------------------\n", adjectiveTwo, genderOptionThree);
    console.printf("My origin is deep, it's been %s weeks\n", ageInWeeks);
    console.printf("In the backstreets of %s, learnt to sneak\n", hometown);
    console.printf("%s, %s, %s, it's what I did\n", verbOne, verbTwo, verbThree);
    console.printf("But now i'm chilling with %s, no longer a kid\n------------------\n", favouritePerson);
    console.printf("My rap skills are pretty %s, huh?\n", adjectiveThree);
    console.printf("Promise it wasn't generated by a comput-erh\n");
    console.printf("I hope this script ran smooth, without a bug\n");
    console.printf("This is the end of the rap. Turn it off. Unplug.\n------------------\n");
  }
}
