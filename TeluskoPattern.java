public class TeluskoPattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            System.out.println();
            if(i==1){
                for(j=1;j<=69;j++) {
                    if (j % 2 != 0) {
                        if (j==11||j==19||j==23||j==25||j==27||j==31||j==33||j==35||j==39||j==51||j==55||j==59)
                            System.out.print(" ");
                        else
                            System.out.print("*");
                    } else
                        System.out.print(" ");
                }
            }
            else if(i==2||i==4){
                for(j=1;j<=69;j++) {
                    if (j % 2 != 0) {
                        if (j==5||j==13||j==21||j==29||j==37||(j==41&&i==2)||(j==49&&i==4)||j==53||j==55||j==61||j==69)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else
                        System.out.print(" ");
                }
            }
            else if(i==3){
                for(j=1;j<=69;j++) {
                    if (j % 2 != 0) {
                        if (j==5||j==13||j==15||j==17||j==21||j==29||j==37||j==41||j==43||j==45||j==47||j==49||j==53||j==61||j==69)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else
                        System.out.print(" ");
                }
            }
            else
                for(j=1;j<=69;j++) {
                    if (j % 2 != 0) {
                        if (j==1||j==3||j==7||j==9||j==11||j==19||j==27||j==39||j==51||j==55||j==59)
                            System.out.print(" ");
                        else
                            System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
        }
    }
}
