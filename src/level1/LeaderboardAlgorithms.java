package level1;

import java.util.ArrayList;

/**
 * STUDENT TODO FILE
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
 */
public class LeaderboardAlgorithms {

    /**
     * TODO: Sort the list by score DESCENDING (highest score first).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */
    public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
        // TODO
    	for (int i = 0; i < list.size() - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getScore() > list.get(maxIndex).getScore()) {
                    maxIndex = j;
                }
            }

            ScoreEntry temp = list.get(maxIndex);
            list.set(maxIndex, list.get(i));
            list.set(i, temp);
        }
    }

    /**
     * TODO: Sort the list by username ASCENDING (A -> Z).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     */
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        // TODO
    	for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getUsername().compareToIgnoreCase(list.get(minIndex).getUsername()) < 0) {
                    minIndex = j;
                }
            }
            ScoreEntry temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    /**
     * TODO: Binary search for an EXACT username match.
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
    public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
    	int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midVal = list.get(mid).getUsername();

            int cmp = midVal.compareToIgnoreCase(username);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
