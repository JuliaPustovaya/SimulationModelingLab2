import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class FormTable {
    public static Integer X = 0;
    public static Integer Y = 0;
    public static Integer Z = 0;

    public static ArrayList<LocalTime> time = new ArrayList<>();
    public static ArrayList<LocalTime> startA = new ArrayList<>();
    public static ArrayList<LocalTime> startB = new ArrayList<>();
    public static ArrayList<LocalTime> finishB = new ArrayList<>();
    public static ArrayList<LocalTime> finishA = new ArrayList<>();
    public static ArrayList<LocalTime> timeWait = new ArrayList<>();

    public static ArrayList<Object> resultTable = new ArrayList<Object>();

    public static ArrayList<Object> formTable() {
     /*   int a1 = InitialX.X1Randoms.get(X);
        int a2 = InitialX.X1.get(InitialX.getNumberCategory(a1, InitialX.X1RandomPair, InitialX.X1));
       double a3 = time.get(X - 1) + a2;
        int a4 = InitialX.X2Randoms.get(X);
        int a5 = InitialX.X2.get(InitialX.getNumberCategory(a4, InitialX.X2RandomPair, InitialX.X2));
        int a6 = InitialX.X3Randoms.get(X);
        int a7 = InitialX.X3.get(InitialX.getNumberCategory(a6, InitialX.X3RandomPair, InitialX.X3));
        int a8 = InitialX.X4Randoms.get(X);
        int a9 = InitialX.X4.get(InitialX.getNumberCategory(a8, InitialX.X4RandomPair, InitialX.X4));
        double a10 = 0;
        double a11 = 0;
        double a12 = 0;
        double a13 = 0;
        switch (a5) {
            case 0:
                a10 = finishA.get(Y - 1);
                a11 = a10 + a9;
                startA.add(a10);
                finishA.add(a11);
                timeWait.add(startA.get(Y) - a3);
                Y++;
                break;
            case 1:
                a12 = finishB.get(Z - 1);
                a13 = a12 + a9;
                startB.add(a12);
                finishB.add(a13);
                timeWait.add(startB.get(Z) - a3);
                Z++;
                break;
            default:
                throw new IllegalArgumentException("Unexpected doctor");

        }
        X++;*/
        return resultTable;
    }
    public static ArrayList<Object> formTableFirstRow() {
        time.add( LocalTime.of(8,30));
        startA.add(LocalTime.of(9,0));
        startB.add(LocalTime.of(9,0));
        int a1 = InitialX.X1Randoms.get(X);
        resultTable.add(a1);
        int a2 = InitialX.getNumberCategory(a1, InitialX.X1RandomPair, InitialX.X1);
        resultTable.add(a2);
        LocalTime a3 = time.get(X).plusMinutes(a2);
        resultTable.add(a3);

        int a4 = InitialX.X2Randoms.get(X);
        resultTable.add(a4);

        int a5 = InitialX.getNumberCategory(a4, InitialX.X2RandomPair, InitialX.X2);
        resultTable.add(a5==0? "A":"B");

        int a6 = InitialX.X3Randoms.get(X);
        int a7 = InitialX.getNumberCategory(a6, InitialX.X3RandomPair, InitialX.X3);
        resultTable.add(a6);
        resultTable.add(a7==0? "Нет":"Да");

        int a8 = InitialX.X4Randoms.get(X);
        resultTable.add(a8);
        int a9 = InitialX.getNumberCategory(a8, InitialX.X4RandomPair, InitialX.X4);
        resultTable.add(a9);
        LocalTime a10 ;
        LocalTime a11 ;
        LocalTime a12 ;
        LocalTime a13 ;
        switch (a5) {
           case 0:
                a10 = startA.get(0);
                a11 = a10.plusMinutes(a9);
                resultTable.add(a10);
                resultTable.add(a11);
                startA.add(a10);
                finishA.add(a11);

                timeWait.add(LocalTime.from(Instant.ofEpochMilli(startA.get(Y).toNanoOfDay()-a3.toNanoOfDay()).atZone(ZoneId.systemDefault()).toLocalDate()));
                resultTable.add(timeWait);
                Y++;
                break;
            case 1:
                a12 = startB.get(0);
                a13 = a12.plusMinutes(a9);
                resultTable.add(a12);
                resultTable.add(a13);
                startB.add(a12);
                finishB.add(a13);

                timeWait.add(LocalTime.ofNanoOfDay(startB.get(Z).toNanoOfDay()-a3.toNanoOfDay()));
                resultTable.add(timeWait);
                Z++;
                break;
            default:
                throw new IllegalArgumentException("Unexpected doctor");

        }
        X++;
        return resultTable;
    }

}
