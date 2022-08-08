import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



                double[] home3 = {5.4,2,-1,5.8,-9.4,2.9};
                boolean negative = false;
                double sum = 0;
                int length = 0;
//                home3[0] = 5.4;
//                home3[1] = 2;
//                home3[2] = -1;
//                home3[3] = 5.8;
//                home3[4] = -9.4;
//                home3[5] = 2.9;
//                home3[6] = 7.3;
//                home3[7] = -8.9;
//                home3[8] = -1.5;
//                home3[9] = 0;
//                home3[10] = 1.4;
//                home3[11] = 4.8;
//                home3[12] = -2.6;
//                home3[13] = 8.7;
//                home3[14] = -1.8;
                double arif;
                boolean dot = false;
                while (!dot) {
                    dot = true;
                    for (int i = 0; i < home3.length - 1; i++) {
                        if (home3[i]   > home3[i + 1]) {
                            dot = false;
                            arif = home3[i];
                            home3[i] = home3[i + 1];
                            home3[i + 1] = arif;
                        }
                        System.out.println(Arrays.toString(home3));
                    }
                }
                for (double valli : home3) {
                    if (valli < 0) {
                        negative = true;
                    }
                    if (negative) {
                        if (valli > 0) {
                            sum = sum + valli;
                            length++;
                        }
                    }

                }
                double ar = sum / length;
                System.out.println("Ср ариф = " + ar);


            }
        }

