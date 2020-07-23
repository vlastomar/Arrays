import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //int sizeOfField = Integer.parseInt(scan.nextLine());
        int[] fieldLady = new int[Integer.parseInt(scan.nextLine())];

        int[] initialPositionOfLadybugs = Arrays.stream(scan.nextLine().split(" ")).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i <initialPositionOfLadybugs.length ; i++) {
            if (initialPositionOfLadybugs[i] < fieldLady.length && initialPositionOfLadybugs[i] >=0) {
                fieldLady[initialPositionOfLadybugs[i]] = 1;
            }
        }

        while (true){
            String[] action = scan.nextLine().split(" ");
            if ("end".equals(action[0])){
                break;
            }
            int checkMove = Integer.parseInt(action[2]);
            /*if (checkMove < 0 && "right".equals(action[1])){
                action[1] = "left";
            }else if(checkMove < 0 && "left".equals(action[1])){
                action[1] = "right";
            }*/
            int positionOut = Integer.parseInt(action[0]);
            String directionInsect = action[1];
            //int numberMove = Math.abs(checkMove);
            if (positionOut < 0 || positionOut >= fieldLady.length || fieldLady[positionOut] == 0){
                continue;
            }
            fieldLady[positionOut] = 0;
            int currentFlight = checkMove;
             if ("right".equals(directionInsect)){
                //int positionIn = positionOut + numberMove;

                /*if (positionIn < sizeOfField) {
                   if (fieldLady[positionIn] == 0) {
                        fieldLady[positionIn] = 1;
                    } else if (fieldLady[positionIn] == 1){
                        int temp = positionIn + numberMove;
                        for (int i = temp; i < sizeOfField ; i+=numberMove) {
                            positionIn += numberMove;
                            if (positionIn < sizeOfField && fieldLady[positionIn] == 0){
                                fieldLady[positionIn] = 1;
                            }
                        }
                    }*/
                    while (true){
                        if (positionOut + currentFlight >= fieldLady.length || positionOut + currentFlight < 0) {
                            break;
                        }
                        if (fieldLady[positionOut + currentFlight] == 0){
                            fieldLady[positionOut + currentFlight] = 1;
                            break;
                        }else{
                            currentFlight += checkMove;
                        }
                    }
            }else if ("left".equals(directionInsect)){
                 /*int positionIn = positionOut - numberMove;

                 if (positionIn >= 0) {
                     if (fieldLady[positionIn] == 0) {
                         fieldLady[positionIn] = 1;
                     } else if (fieldLady[positionIn] == 1){
                         int temp = positionIn - numberMove ;
                         for (int i = temp; i > 0; i-= numberMove) {
                             positionIn -= numberMove;
                             if (positionIn > 0 && fieldLady[positionIn] == 0){
                                 fieldLady[positionIn] = 1;
                             }
                         }
                     }
                 }*/

                 while (true){
                     if (positionOut - currentFlight < 0  || positionOut - currentFlight >=fieldLady.length){
                         break;
                     }
                     if (positionOut - currentFlight == 0){
                         fieldLady[positionOut - currentFlight] = 1;
                         break;
                     }else{
                         currentFlight += checkMove;
                     }

                 }
             }
        }
        for (int num:fieldLady) {
            System.out.print(num + " ");
        }

    }
}
