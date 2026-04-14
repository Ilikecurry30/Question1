public class WordMatch {
    private String secret;

    public WordMatch(String word){
        secret= word;

    }
    public static void main(String[] args) {
        
        WordMatch q = new WordMatch("crescendo"); 
        
        System.out.println(q.scoreGuess("r"));
        System.out.println( q.findBetterGuess("Jay", "Jayanth"));
        
    }


    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }
        return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess(guess1) > scoreGuess(guess2)) {
            return guess1;
        }
        else{
            return guess2;
        }
    }
}
