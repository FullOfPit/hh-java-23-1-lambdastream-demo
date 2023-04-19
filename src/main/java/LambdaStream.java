import java.util.List;
import java.util.function.*;

public class LambdaStream {

    //Link auf Mitschrift: https://github.com/FullOfPit/hh-java-23-1-lambdastream-demo
    //Link auf Übungsaufgaben: https://github.com/neuefische/hh-java-23-1-lambdastreams-exercise

    //1) Übungsaufgaben bis -- 10.40
    //2) 5 min Pause 10.40 - 10.45
    //3) Vorstellung Lambdas
    //4) 15 - 30 min Aufgabe bis 12.00
    //5) Vorstellung Streams
    //6) Refaktorierung Übungsaufgaben bis 14.00

    public static int addOne(int number) {
        return number + 1;
    }
    //Function<Eingabewert, Ausgabewert> name = Eingabewert -> Logik, Rückgabe
    Function<Integer, Integer> addOneToLambda = num -> num + 1;
    public static int addOneAndDouble(int number) {
        return (number + 1) * 2;
    }

    //Lambdas/Streams

    //Lambda: kleines Funktionen, die einzelne Logischritte ausführen

    //  (parameter) -> {body}                   -   Allgemeine Lambda Schreibweise

    //  parameter -> body                       -   Lambda mit 1 Parameter und one-line Logik
    //  () -> body                              -   Lambda ohne Parameter und one-line Logik
    //  (parameter 1, parameter 2) -> body;     -   Lambda mit 2 Parametern und one-line Logik

    //  parameter -> {                          -   Lambda mit 1 Parameter und multi-line Logik
    //          zeile 1;
    //          zeile 2;
    //          return ausgabe;
    //  }

    //Bifunction<Eingabewert 1, Eingabewert 2, Ausgabewert> name = (Eingabewert 1, Eingabewert 2) -> Logik, Ausgabewert
    BiFunction<Integer, Integer, String> stringFromTwoInts = (x, y) -> Integer.toString(x + y);



    //Consumer<Eingabewert> name = Eingabewert -> Logik, OHNE Ausgabewert
    Consumer<String> printString = str -> System.out.println(str);

    //Predicate<Eingabewert> name = Eingabewert -> Logik, boolean Ausgabewert
    Predicate<String> isLongerThanTen = str -> str.length() > 10;


    public static void main(String[] args) {
        /*

        int[] someNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        String resultString = "";

        for (Integer number : someNumbers) {
            if (number > 4) {
                int squared = number * number;
                String squaredString = String.valueOf(squared);
                resultString += squaredString;
                System.out.println(squaredString);
            }
        }
        System.out.println(resultString);

         */
        //Zuweisung Lambda function zu addOneToLambda variablen;
        Function<Integer, Integer> addOneToLambda = num -> num + 1;
        //Aufruf der function
        System.out.println(addOneToLambda.apply(1));
        //Anwendung der .forEach() methode mit lambda function als Übergabeparameter
        List.of(1, 2, 3, 4, 5, 6).forEach(num -> System.out.println(num));


    }

    /*
        Kurzübung code beautification zu Lambdas:


        try {
            methodThatShouldThrowAnExceptionOrError();
            fail();
        } catch (YourChosenException ignored) {
            verify(inCaseYouAreVerifyingSomething);
            Assertions.assertTrue(true);
        }

        //stattdessen

        Assertions.assertThrows(YourChosenException.class, (parameter) -> methodCall_ThatsSupposedToThrowAnException());


        findWhatYouReallyReallyWantById (String id) {
            if (somethingBadHappens) {
                throw new YourChosenException()
            } else {
                return whatYouReallyReallyWant
            }
        }

        //stattdessen

        return this.repository.findWhatYouReallyReallyWantById(id).orElseThrow(() -> new YourChosenException());

         */
}
