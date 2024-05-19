public class BuilderPattern {
    private String basement;
    private String structure;
    private String roof;
    private String interior;

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "basement='" + basement + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }

    interface Builder {
        void setBasement();
        void setStructure();
        void setRoof();
        void setInterior();
        BuilderPattern build();
    }

    public static class ConcreteBuilder implements Builder {
        private BuilderPattern house;

        public ConcreteBuilder() {
            this.house = new BuilderPattern();
        }

        @Override
        public void setBasement() {
            house.setBasement("Concrete Basement");
        }

        @Override
        public void setStructure() {
            house.setStructure("Wooden Structure");
        }

        @Override
        public void setRoof() {
            house.setRoof("Shingle Roof");
        }

        @Override
        public void setInterior() {
            house.setInterior("Drywall Interior");
        }

        @Override
        public BuilderPattern build() {
            return this.house;
        }
    }

    public static class Director {
        private Builder builder;

        public Director(Builder builder) {
            this.builder = builder;
        }

        public BuilderPattern constructHouse() {
            builder.setBasement();
            builder.setStructure();
            builder.setRoof();
            builder.setInterior();
            return builder.build();
        }
    }

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        BuilderPattern house = director.constructHouse();

        System.out.println(house);
    }
}
