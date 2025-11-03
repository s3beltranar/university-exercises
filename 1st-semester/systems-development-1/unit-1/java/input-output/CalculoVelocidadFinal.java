import java.util.Scanner;
public class CalculoVelocidadFinal {
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String ROJO = "\u001B[31m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String SUBRAYADO = "\u001B[4m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(ROJO + "//////////////////////////////////////////////////////////////////////////////////////////////////////////\n" +
                        "//                                                                               ;                      //\n" +
                        "//                                                                               ED.              :     //\n" +
                        "//                        ,;L.                              ,;L.                 E#Wi            t#,    //\n" +
                        "// .          t         f#i EW:        ,ft                f#i EW:        ,ft t   E###G.         ;##W.   //\n" +
                        "// Ef.        Ej      .E#t  E##;       t#E              .E#t  E##;       t#E Ej  E#fD#W;       :#L:WE   //\n" +
                        "// E#Wi       E#,    i#W,   E###t      t#E t      .DD. i#W,   E###t      t#E E#, E#t t##L     .KG  ,#D  //\n" +
                        "// E#K#D:     E#t   L#D.    E#fE#f     t#E EK:   ,WK. L#D.    E#fE#f     t#E E#t E#t  .E#K,   EE    ;#f //\n" +
                        "// E#t,E#f.   E#t :K#Wfff;  E#t D#G    t#E E#t  i#D :K#Wfff;  E#t D#G    t#E E#t E#t    j##f f#.     t#i//\n" +
                        "// E#WEE##Wt  E#t i##WLLLLt E#t  f#E.  t#E E#t j#f  i##WLLLLt E#t  f#E.  t#E E#t E#t    :E#K::#G     GK //\n" +
                        "// E##Ei;;;;. E#t  .E#L     E#t   t#K: t#E E#tL#i    .E#L     E#t   t#K: t#E E#t E#t   t##L   ;#L   LW. //\n" +
                        "// E#DWWt     E#t    f#E:   E#t    ;#W,t#E E#WW,       f#E:   E#t    ;#W,t#E E#t E#t .D#W;     t#f f#:  //\n" +
                        "// E#t f#K;   E#t     ,WW;  E#t     :K#D#E E#K:         ,WW;  E#t     :K#D#E E#t E#tiW#G.       f#D#;   //\n" +
                        "// E#Dfff##E, E#t      .D#; E#t      .E##E ED.           .D#; E#t      .E##E E#t E#K##i          G#t    //\n" +
                        "// jLLLLLLLLL;E#t        tt ..         G#E t               tt ..         G#E E#t E##D.            t     //\n" +
                        "//            ,;.                       fE                                fE ,;. E#t                    //\n" +
                        "//                                       ,                                 ,     L:                     //\n" +
                        "//////////////////////////////////////////////////////////////////////////////////////////////////////////" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(MAGENTA + "═══════════════ INTRODUCE TU NOMBRE ═══════════════");
        String nombre = input.nextLine();
        System.out.println("▶ Cual es el nombre del objeto?: ");
        String objeto = input.nextLine();
        System.out.println("▶ Cual es la altura?: " + RESET);
        double altura = input.nextDouble();
        double gravedad = 9.8;
        double velocidadfinal = Math.sqrt(2 * gravedad * altura);
        System.out.printf(SUBRAYADO + VERDE + "▀▄▀▄▀▄ %s, si tu %s cae desde %.2f metros, entonces, su velocidad final seria de: %.2f m/s ▄▀▄▀▄▀", nombre, objeto, altura, velocidadfinal);
    }
}
