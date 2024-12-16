public class Movies {
    public static void main(String[] args) {
        String[]moviesWithIndi={"Raiders of the Lost Ark","Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade"};

        String[][]actors;
        actors=new String[][]{
                {"Harrison Ford", "Karen Allen", "Paul Freeman" },
                {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan" },
                {"Harrison Ford", "Sean Connery", "Denholm Elliott"}
        };

        for (int i = 0; i < moviesWithIndi.length; i++) {
            System.out.println("Dans le film " + moviesWithIndi[i] + ", les principaux acteurs sont : " +
                    String.join(", ", actors[i]) + ".");
        }

    }
}
