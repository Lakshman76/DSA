public class iNeuronPattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            System.out.println();
            if (i == 1 || i == 5) {
                for (j = 1; j <= 65; j++) {
                    if (j % 2 != 0) {
                        if (j==3||j==7||j==9||j==11||j==15||j==23||((j==27||j==29||j==31)&&i==1)||j==35||(j==39&&i==5)||j==43||j==55||j==59||j==61||j==63)
                            System.out.print(" ");
                        else
                            System.out.print("*");
                    } else
                        System.out.print(" ");
                }
            } else if (i == 2 || i == 4) {
                for (j = 1; j <= 65; j++) {
                    if (j % 2 != 0) {
                        if (j==1||j==5||(j==7&&i==2)||((j==11||j==39||j==63)&&i==4)||j==13||j==17||j==25||j==33||j==37||(j==41&&i==2)||j==45||j==53||j==57||(j==59&&i==2)||j==65)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    } else
                        System.out.print(" ");
                }
            }else
            for (j = 1; j <= 65; j++) {
                if (j % 2 != 0) {
                    if (j==3||j==7||j==11||j==15||j==23||j==27||j==29||j==31||j==35||j==43||j==47||j==49||j==51||j==55||j==59||j==63)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                } else
                    System.out.print(" ");
            }

        }
    }
}
