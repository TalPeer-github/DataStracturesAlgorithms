import java.util.ArrayList;

public class TechnionTournament implements Tournament{

    TechnionTournament(){};

    @Override
    public void init() {
        root =
    }

    @Override
    public void addFacultyToTournament(Faculty faculty) {
        // O(log(n))
    }

    @Override
    public void removeFacultyFromTournament(int faculty_id){
        // O(log(n)+ log(m))
    }

    @Override
    public void addPlayerToFaculty(int faculty_id,Player player) {
        // O(log(n)+ log(m))
    }

    @Override
    public void removePlayerFromFaculty(int faculty_id, int player_id) {
        // O(log(n)+ log(m))
    }

    @Override
    public void playGame(int faculty_id1, int faculty_id2, int winner,
                         ArrayList<Integer> faculty1_goals, ArrayList<Integer> faculty2_goals) {
        // O(log(n)+ k*log(m))
    }

    @Override
    public void getTopScorer(Player player) {
        // O(1)
    }

    @Override
    public void getTopScorerInFaculty(int faculty_id, Player player) {
        // O(log(n))
    }

    @Override
    public void getTopKFaculties(ArrayList<Faculty> faculties, int k, boolean ascending) {
        // O(k)
    }

    @Override
    public void getTopKScorers(ArrayList<Player> players, int k, boolean ascending) {
        // o(k)
    }

    @Override
    public void getTheWinner(Faculty faculty) {
        // O(1)
    }

    ///TODO - add below your own variables and methods
}
