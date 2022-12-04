package timus.timus_task2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lr2_task2100 {
    public static void main(String[] args) {

        String inputFileName = "src/timus/timus_task2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int MandL = 2;

        try {

            BufferedReader bufferedreader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName));

            String readLine;

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while((readLine= bufferedreader.readLine()) != null) {
                if (numberOfFriends == 0) {
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numberOfPairs++;
                }
            }

                    int result;

                    int guest = (MandL + numberOfFriends + numberOfPairs);

                    if (guest == 13) {
                        result = (guest * 100) + 100;
                    } else {
                        result = guest * 100;
                    }

                    System.out.println(result);
                }catch (IOException exception) {
            exception.printStackTrace();
            }

            }
        }



