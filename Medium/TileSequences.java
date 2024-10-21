import java.util.HashSet;
import java.util.Set;

public class TileSequences {
    public int numTilePossibilities(String tiles) {
        Set<String> result = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles.toCharArray(), used, new StringBuilder(), result);
        return result.size();
    }

    private void backtrack(char[] tiles, boolean[] used, StringBuilder sequence, Set<String> result) {
        if (sequence.length() > 0) {
            result.add(sequence.toString());
        }
        for (int i = 0; i < tiles.length; i++) {
            if (used[i] || (i > 0 && tiles[i] == tiles[i - 1] && !used[i - 1])) continue;
            used[i] = true;
            sequence.append(tiles[i]);
            backtrack(tiles, used, sequence, result);
            used[i] = false;
            sequence.deleteCharAt(sequence.length() - 1);
        }
    }

    public static void main(String[] args) {
        TileSequences ts = new TileSequences();
        System.out.println(ts.numTilePossibilities("AAB")); // Output: 8
    }
}
