public class TeluskoPattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            System.out.println();
            if(i==1){
                for(j=1;j<=63;j++) {
                    if (j % 2 != 0) {
                        if (j==1||j==3||j==5||j==7||j==9||j==19||j==37||j==39||j==41||j==43||j==45||j==55||j==57||j==59||j==61||j==63)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    } else if (j==12||j==14||j==16||j==26||j==34||j==48||j==52)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
            }
            else if(i==2||i==4){
                for(j=1;j<=63;j++) {
                    if (j % 2 != 0) {
                        if (j==5||j==19||(j==37&&i==2)||(j==45&&i==4)||j==55||j==63)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    } else if (j==12 || j==26 || j==34 || j==48 || j==50)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
            }
            else if(i==3){
                for(j=1;j<=63;j++) {
                    if (j % 2 != 0) {
                        if (j==5||j==19||j==37||j==39||j==41||j==43||j==45||j==55||j==63)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    } else if (j==12 || j==14 || j==16 || j==26 || j==34 || j==48)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
            }
            else
                for(j=1;j<=63;j++) {
                    if (j % 2 != 0) {
                        if (j==5||j==19||j==21||j==23||j==37||j==39||j==41||j==43||j==45||j==55||j==57||j==59||j==61||j==63)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    } else if (j==12 || j==14 || j==16 || j==26 ||j==28||j==30 || j==32||j==34|| j==48 || j==52)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
        }
    }
}
