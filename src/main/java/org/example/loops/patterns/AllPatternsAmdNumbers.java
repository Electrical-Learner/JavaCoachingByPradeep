package org.example.loops.patterns;

import org.w3c.dom.ls.LSOutput;

public class AllPatternsAmdNumbers {
    public static void main(String[] args) {
//        int n = 3;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        starPyramid();
//        invertedStar();
//     pyramidNumber();
// invertedNumber();
//  starSlopeRight();
//      starSlopeLeft();
//     starSlope();
// starNumberBlock();
        // leftSlopeStar();
//        halfButterfly();
    //    upAndDownButterfly();

    }


    private static void starPyramid() {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void invertedStar() {
        int n = 3;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void pyramidNumber() {
        int n = 3;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    private static void invertedNumber() {
        int n = 3;
        int number = 7;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    private static void starSlopeRight() {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void starSlopeLeft() {
        int n = 3;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void starSlope() {
        int n = 3;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void starNumberBlock() {
        int number = 1;
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                } else {
                    System.out.print("*" + " ");
                }
                number++;
            }
            System.out.println();
        }
    }

    private static void leftSlopeStar() {
        int n = 3;
        int m = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void halfButterfly() {

//        for (int i = 1; i <= n; i++) {                  //left star
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            for (int j = 1; j < n - i; j++) {
//                System.out.print(" " + " ");
//            }
//            System.out.println();
//        }
//            for (int j = 1; j <= n - 1; j++) {                  //right star
//                System.out.print(" ");
//            }
//            // int i = 0;
//            for (int j = 1; j < n - i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//    }
        int n = 5;
        int m = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j <= i) {
                    System.out.print(" * ");
                } else {
                    if (9 - j >= i) {
                        System.out.print("   ");
                    } else {
                        System.out.print(" * ");

                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void upAndDownButterfly() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j < n - i; j++) {
                System.out.print(" " + " ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j < n - i; j++) {
                System.out.print(" " + " ");
            }
            System.out.println();
        }
    }

}






