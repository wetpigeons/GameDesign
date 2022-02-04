public class OutputProject {
    public static void main(String[] args){
        clear();
        dog1();
        wait(750);
        clear();
        dog2();
        wait(750);
        clear();
        dog3();
        wait(750);
        clear();
        dog4();
        for(int i=0; i<20;i++) {
            wait(250);
            clear();
            dog2();
            wait(250);
            clear();
            dog4();
        }
        wait(250);
        clear();
        dog1();
        wait(500);
        clear();
        dog1();
    }
    public static void wait(int time){
        try {
            Thread.sleep(time);
        } catch(Exception e){

        }
    }
    public static void clear(){
        System.out.print("\f");
    }
    public static void dog1(){
        System.out.println("                  ;~~,__\n" +
                "   :-....,-------'`-'._.'\n" +
                "    `-,,,  ,       ,'~~'\n" +
                "        ; ,'~.__; /\n" +
                "        :|      :|\n" +
                "        `-'     `-'");
    }
    public static void dog2(){
        System.out.println("                  ;~~,__\n" +
                "   :-....,-------'`-'._.'\n" +
                "    `-,,,  ,       ,'~~'\n" +
                "        ; ,'~.__; /--.\n" +
                "        :| :|   :|``(;\n" +
                "        `-'`-'  `-'");
    }
    public static void dog3(){
        System.out.println("                  ;~~,__\n" +
                "   :-....,-------'`-'._.'\n" +
                "    `-,,,  ,       ;'~~'\n" +
                "       ,'_,'~.__; '--.\n" +
                "      //'       ````(;\n" +
                "     `-'");
    }
    public static void dog4(){
        System.out.println("                .--~~,__\n" +
                "   :-....,-------`~~'._.'\n" +
                "    `-,,,  ,_      ;'~U'\n" +
                "     _,-' ,'`-__; '--.\n" +
                "    (_/'~~      ''''(;");
    }
}


