
package com.company;

import java.util.Arrays;

        public class Main {

            public static void main(String[] args) {
                double[] array = {1.2, -1.5, 5.2, 5.0, 3.3, -4.2, -3.2, 8.0, -2.3, 1.0, 1.2, -1.3, 1.4, 1.5};
                for (int i = 0; i <array.length -1 ; i++) {
                    System.out.println(Arrays.toString(array));

                    for (int j = array.length -1; j < i; j++) {
                        if (array[j - 1] > array[j]){
                            double value = array[j -1];
                            array[j-1] = array[j];
                            array[j] = value;

                        }

                    }


                }
                double numValue = 0.0;
                int intValue = 0;
                boolean value = false;

                for (double doub: array) {
                    if (doub < 0) {
                        value = true;
                    }else if (value){
                        numValue += doub;
                        intValue++;
                    }

                }
                double ty = numValue / intValue;

                System.out.println("\n Middle value of arithmetic: " + ty);



            }
        }

