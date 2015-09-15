package liquibasedemo.data;

public class ActorBuilder {

    private String name;
    private Character sex;

    public static ActorBuilder newActor() {
        return new ActorBuilder();
    }

    private ActorBuilder() {
    }

    public ActorBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ActorBuilder sex(Sex sex) {
        this.sex = sex.get();
        return this;
    }

    public Actor build() {
        Actor actor = new Actor();
        actor.setName(name);
        actor.setSex(sex);
        return actor;
    }

    public static enum Sex {
        MALE('M'), FEMALE('F');

        private char c;

        Sex(char c) {
            this.c = c;
        }

        public Character get() {
            return c;
        }
    }

}
