package by.epam.learn.collections.enumset;

public enum Country {
    ARMENIA(3,28_470),
    BELARUS(9,202-910),
    INDIA(1_370, 2_973_190),
    KAZAKHSTAN(18,2_699_700),
    POLAND(38, 306_230),
    UKRAINE(43, 579_320);
    private int population;
    private int landAreas;

    Country(int population, int landAreas) {
        this.population = population;
        this.landAreas = landAreas;
    }
    public void grow(int additionsPopulation){
        population += additionsPopulation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getLandAreas() {
        return landAreas;
    }

    public void setLandAreas(int landAreas) {
        this.landAreas = landAreas;
    }
}
