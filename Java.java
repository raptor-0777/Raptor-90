import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);

            String[] words = {
                "okay", "yes", "no", "please", "thank", "sorry", "hello", "goodbye", "yes", "no", 
                "please", "thanks", "welcome", "congratulations", "well", "sure", "fine", "great", "awesome", 
                "thanks", "good", "bad", "help", "okay", "sure", "no problem", "of course", "please", 
                "excuse", "goodbye", "how", "why", "where", "when", "what", "who", "which", "I", "you", 
                "he", "she", "we", "they", "it", "is", "are", "was", "were", "am", "can", "will", "have", 
                "had", "doing", "do", "does", "did", "be", "been", "being", "go", "goes", "gone", "get", 
                "gets", "got", "gotten", "make", "makes", "making", "eat", "eats", "eating", "drink", 
                "drinks", "drinking", "come", "comes", "coming", "want", "wants", "wanting", "need", "needs", 
                "needed", "think", "thinks", "thinking", "believe", "believes", "believed", "know", "knows", 
                "knowing", "understand", "understands", "understood", "like", "likes", "liked", "liking", 
                "love", "loves", "loving", "hate", "hates", "hating", "prefer", "prefers", "preferred", 
                "enjoy", "enjoys", "enjoying", "remember", "remembers", "remembered", "forget", "forgets", 
                "forgot", "talk", "talks", "talking", "listen", "listens", "listening", "speak", "speaks", 
                "speaking", "read", "reads", "reading", "write", "writes", "writing", "study", "studies", 
                "studying", "work", "works", "working", "play", "plays", "playing", "watch", "watches", 
                "watching", "feel", "feels", "feeling", "stay", "stays", "staying", "sleep", "sleeps", 
                "sleeping", "wake", "wakes", "waking", "help", "helps", "helping", "fix", "fixes", "fixing", 
                "build", "builds", "building", "create", "creates", "creating", "start", "starts", "starting", 
                "finish", "finishes", "finishing", "buy", "buys", "buying", "sell", "sells", "selling", 
                "borrow", "borrows", "borrowing", "lend", "lends", "lending", "take", "takes", "taking", 
                "give", "gives", "giving", "send", "sends", "sending", "receive", "receives", "receiving", 
                "show", "shows", "showing", "bring", "brings", "bringing", "catch", "catches", "catching", 
                "helpful", "useful", "important", "needed", "necessary", "perfect", "correct", "true", 
                "false", "real", "fake", "new", "old", "young", "newer", "older", "better", "best", "worst", 
                "good", "bad", "happy", "sad", "angry", "excited", "tired", "hungry", "full", "empty", 
                "bored", "surprised", "confused", "clear", "unclear", "right", "left", "up", "down", 
                "inside", "outside", "near", "far", "close", "distant", "before", "after", "now", "later", 
                "today", "tomorrow", "yesterday", "always", "never", "sometimes", "often", "rarely", 
                "usually", "usually", "maybe", "perhaps", "certainly", "definitely", "absolutely", "probably", 
                "exactly", "approximately", "actually", "clearly", "seriously", "definitely", "absolutely", 
                "obviously", "usually", "totally", "completely", "literally", "apparently", "practically", 
                "probably", "probably", "possibly", "certainly", "clearly", "frequently", "occasionally", 
                "constantly", "immediately", "soon", "gradually", "quickly", "slowly", "hard", "easily", 
                "well", "badly", "smoothly", "awkwardly", "carefully", "dangerously", "recklessly", "correctly", 
                "incorrectly", "quick", "fast", "slow", "new", "old", "younger", "older", "stronger", 
                "weaker", "taller", "shorter", "fatter", "thinner", "prettier", "more", "less", "better", 
                "worse", "safely", "unsafe", "wealthy", "poor", "rich", "easy", "difficult", "harder", 
                "simpler", "harder", "complex", "simple", "silly", "serious", "funny", "strange", 
                "normal", "weird", "unusual", "odd", "common", "rare", "unique", "normal", "natural", 
                "unnatural", "sociable", "shy", "sensitive", "insensitive", "friendly", "unfriendly", 
                "polite", "impolite", "kind", "mean", "gentle", "harsh", "lovely", "unlovely", 
                "honest", "dishonest", "trustworthy", "untrustworthy", "helpful", "unhelpful", 
                "confident", "shy", "independent", "dependent", "honorable", "dishonorable"
            };
        
            System.err.print(" Enter you word ");
            String sas = scanner.nextLine();

                for (int i = 0; i < words.length; i++) {

                    if (words[i].toLowerCase().contains(sas.toLowerCase())) {
                        
                        System.err.println("You select " + sas + " it is true .");
                        break;

                    }
                    

                    
                }






    }
    
}
