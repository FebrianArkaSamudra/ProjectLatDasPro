public class mainpremiere {
    public static void main(String[] args) {
        premiereservice ps = new premiereservice() ;
        ps.add(new premiereleague("Liverpool", 29, 45, 82));
        ps.add(new premiereleague("Manchester city", 27, 39, 57));
        ps.add(new premiereleague("leicestern", 28, 26, 50));
        ps.add(new premiereleague("Chelsea", 29, 9, 48));
        ps.add(new premiereleague("Wolvehampton", 29, 7, 43));
        ps.add(new premiereleague("shelfield", 29, 5, 43));
        ps.add(new premiereleague("Manchester united", 29, 9, 48));
        ps.add(new premiereleague("Tottenham", 29, 7, 41));
        ps.add(new premiereleague("Arsenal", 28, 4, 40));
        ps.add(new premiereleague("Bumley", 29, -6, 39));
        ps.add(new premiereleague("Crystal palace", 29, -6, 39));
        ps.add(new premiereleague("everton", 29, -6, 37));
        ps.add(new premiereleague("New Castle united", 29, -16, 35));
        ps.add(new premiereleague("Southampton", 29, 17, 34));
        ps.add(new premiereleague("brighton", 29, -8, 29));
        ps.add(new premiereleague("westham united", 29, -15, 27));
        ps.add(new premiereleague("watford", 29, -17, 27));
        ps.add(new premiereleague("AFC Bournemouth", 29, -18, 27));
        ps.add(new premiereleague("Aston villa", 27, -18, 25));
        ps.add(new premiereleague("Norwitch city", 29, -27, 21));


        


    System.out.println("points before sorting");
    ps.displayAll();

    ps.bubbleSort(false);
    System.out.println(" \nPoints after sorting (ascending)");
    ps.displayAll();

    }
}