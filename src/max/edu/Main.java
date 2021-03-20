package max.edu;

public class Main {

    public static void main(String[] args) {
        Door belarusDoor = new Door(
                1,
                2,
                "wood",
                Color.WHITE,
                "modern",
                true,
                true,
                true,
                DoorType.EXTERNAL
        );
        System.out.println(belarusDoor);
    }
}
