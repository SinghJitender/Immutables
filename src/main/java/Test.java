public class Test {

    public static void main(String[] args) {

        RequestAPI api = ImmutableRequestAPI.builder().name("Jitu").age(25).build();

        System.out.println(api);
    }
}
