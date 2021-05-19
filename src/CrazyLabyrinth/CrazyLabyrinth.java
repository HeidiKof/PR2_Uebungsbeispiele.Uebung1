package CrazyLabyrinth;

public class CrazyLabyrinth {
    public boolean checkPathConsistency(LabyrinthTile[] path) {
        for (int i = 0; i < path.length - 1; i++) {
            if (path[i].getExit() == Direction.UP && path[i + 1].getEntry() != Direction.DOWN) {
                return false;
            }
            if (path[i].getExit() == Direction.DOWN && path[i + 1].getEntry() != Direction.UP) {
                return false;
            }
            if (path[i].getExit() == Direction.RIGHT && path[i + 1].getEntry() != Direction.LEFT) {
                return false;
            }
            if (path[i].getExit() == Direction.LEFT && path[i + 1].getEntry() != Direction.RIGHT) {
                return false;
            }

        }
        return true;
    }
}
