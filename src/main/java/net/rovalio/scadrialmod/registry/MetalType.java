package net.rovalio.scadrialmod.registry;

public enum MetalType {
    IRON("Lurcher", "Skimmer", "iron"),
    STEEL("Coinshot", "Coinshot", "steel"),
    TIN("Tineye", "Windwhisperer", "tin"),
    PEWTER("Thug", "Brute", "pewter"),
    ZINC("Rioter", "Sparker", "zinc"),
    BRASS("Soother", "Firesoul", "brass"),
    COPPER("Smoker", "Archivist", "copper"),
    BRONZE("Seeker", "Sentry", "bronze"),
    CHROMIUM("Leecher", "Spinner", "chromium"),
    NICROSIL("Nicroburst", "Soulbearer", "nicrosil"),
    ALUMINIUM("Aluminium Gnat", "Trueself", "aluminium"),
    DURALUMIN("Duralumin Gnat", "Connector", "duralumin"),
    CADMIUM("Pulser", "Gasper", "cadmium"),
    BENDALLOY("Slider", "Subsumer", "bendalloy"),
    GOLD("Augur", "Bloodmaker", "gold"),
    ELECTRUM("Oracle", "Pinnacle", "electrum"),
    ATIUM("Seers", "Framer", "atium");

    // Usamos un Record privado para guardar los datos inmutables
    private final MetalInfo info;

    // Constructor del Enum (simplificado)
    MetalType(String allomancyName, String feruchemyName, String name) {
        this.info = new MetalInfo(allomancyName, feruchemyName, name);
    }

    // Getters
    public String getAllomancyName() { return info.allomancyName(); }
    public String getFeruchemyName() { return info.feruchemyName(); }
    public String getAllomanticMetal() { return info.allomanticMetal(); }

    // Definición del Record interno (boilerplate mínimo)
    private record MetalInfo(String allomancyName, String feruchemyName, String allomanticMetal) {}
}