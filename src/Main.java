import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static int randomNumber(int[] intArray) {
        return intArray[new Random().nextInt(intArray.length)];


    }

    public static boolean cprChecker(String cprNumber) {
        int day = Integer.parseInt(cprNumber.substring(0, 2));
        int month = Integer.parseInt(cprNumber.substring(2, 4));
        boolean statement = false;

        if (day <= 31 && month <= 12 && cprNumber.length() == 10) {
            System.out.println("Your CPR-Number is valid!");
            statement = true;
        } else if (cprNumber.length() != 10 && day <= 31 || month <= 12) {
            System.out.println("Your CPR-number is not valid!");
            statement = false;
        }
        return statement;
    }

    public static void main(String[] args) {
        System.out.println("System is running!");

        // A)
        int[] numberList = {1, 2, 3, 4};

        System.out.println(randomNumber(numberList));

        for (int i = 0; i < 10; i++) {

            System.out.println(randomNumber(numberList));
        }

        // B)
        int cprNumber;


        cprChecker("3202991478");

        // C)
        Article animals = new Article("James Dean", "Coolest Animals in Denmark");

        Article money = new Article("Johnny Songs", "How to make more money (fast)");

        Article XD = new Article("Mememan420", "Modern Internet Lingo");

        Article candy = new Article("Ella Bong", "Why Candy is unhealthy for you");

        Article buildings = new Article("Kim Koi", "Buildings need to be cooler");

        Article[] articles = new Article[]{animals, money, XD, candy, buildings};

        System.out.println(animals.toString());
        System.out.println(money.toString());
        System.out.println(XD.toString());
        System.out.println(candy.toString());
        System.out.println(buildings.toString());

        //D)
        Square smallSquare = new Square(5, 3);

        Square bigSquare = new Square(8, 6);

        Square mediumSquare = new Square<>(6, 5);

        bigSquare.compareTo(smallSquare);

        mediumSquare.compareTo(bigSquare);

        ArrayList<Square> squares = new ArrayList<>();
        squares.add(smallSquare);
        squares.add(bigSquare);
        squares.add(mediumSquare);

      //Collections.sort(squares);
       // ^ I tvivl om hvorfor det ikke virker


//E)
        RedditPost lol = new RedditPost(2023 / 02 / 14, "TimCoox", 1, "Epic meme");
        lol.getVoteBalance();


        RedditPost hehe = new RedditPost(2022 / 01 / 23, "legend420", 1, "Lousy meme");

        lol.compareTo(hehe);

        //F
        ArrayList<RedditPost> posts = new ArrayList<>();
        posts.add(lol);
        posts.add(hehe);
        System.out.println(posts);
        RedditFrontPage.deletePost(posts, 0);
        System.out.println(posts);
    }
}
