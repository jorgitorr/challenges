package desafios;

public class DrawingHanged {
    protected void drawing(int cont){
        String hangingDraw = "";

        switch (cont){
            case 1:
                hangingDraw = "______";
                break;
            case 2:
                hangingDraw = "__|__";
                break;
            case 3:
                hangingDraw =
                        "  | \n" +
                                "__|__";
            case 4:
                hangingDraw =
                        "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 5:
                hangingDraw =
                        "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 6:
                hangingDraw =
                        "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 7:
                hangingDraw =
                        "------" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 8:
                hangingDraw =
                        "------" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 9:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  | \n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 10:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  | \n" +
                                "  | \n" +
                                "__|__";
                break;
            case 11:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |   |\n" +
                                "  | \n" +
                                "__|__";
                break;
            case 12:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |   |\n" +
                                "  |   /\n" +
                                "__|__";
                break;
            case 13:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |   |\n" +
                                "  |   /\\ " + "\n "+
                                "__|__";
                break;
            case 14:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |  /|\n" +
                                "  |   /\\ " + "\n "+
                                "__|__";
                break;
            case 15:
                hangingDraw =
                        "------" +
                                "  |   |\n" +
                                "  |   O\n" +
                                "  |  /|\\n" +
                                "  |   /\\ " + "\n "+
                                "__|__";
                System.out.println("Has muerto, vuelve a intentarlo en otro momento");
                break;
                
        }
        System.out.println(hangingDraw);
    }
}
