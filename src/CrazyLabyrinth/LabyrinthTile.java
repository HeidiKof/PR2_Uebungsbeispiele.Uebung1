package CrazyLabyrinth;

public class LabyrinthTile {
    private Direction entry;
    private Direction exit;

    public LabyrinthTile(Direction entry, Direction exit) {
        this.entry = entry;
        this.exit = exit;
    }

    public Direction getEntry() {
        return this.entry;
    }

    public Direction getExit() {
        return this.exit;
    }

    public void setEntry(Direction entry) {
        this.entry = entry;
    }

    public void setExit(Direction exit) {
        this.exit = exit;
    }
}
