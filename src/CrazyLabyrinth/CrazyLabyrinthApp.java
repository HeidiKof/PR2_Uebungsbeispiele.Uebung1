package CrazyLabyrinth;

public class CrazyLabyrinthApp {
    public static void main(String[] args) {
        LabyrinthTile a = new LabyrinthTile(Direction.UP, Direction.DOWN);
        LabyrinthTile b = new LabyrinthTile(Direction.UP, Direction.RIGHT);
        LabyrinthTile c = new LabyrinthTile(Direction.LEFT, Direction.DOWN);
        LabyrinthTile d = new LabyrinthTile(Direction.UP, Direction.LEFT);
        LabyrinthTile e = new LabyrinthTile(Direction.RIGHT, Direction.UP);


        LabyrinthTile[] lab = {a,b,c,d,e};

        CrazyLabyrinth lab1 = new CrazyLabyrinth();
        System.out.println(lab1.checkPathConsistency(lab));
    }
}
