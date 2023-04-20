public class App {

    static boolean iwillNotCheat = true;
    static boolean IwillWin = true;

    public static void main(String[] args) throws Exception {
        
        //Precondition
        assert iwillNotCheat == true: "ur dead";  //agreement

        enterCompetition();

        //Postcondition
        assert IwillWin == true: "confidence is da key";  //agreement
    }

    static void enterCompetition() {
        IwillWin = false;

    }
}
