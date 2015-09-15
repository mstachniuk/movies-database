package liquibasedemo.data;

public class RoleBuilder {

    private String character;
    private Actor actor;

    public static RoleBuilder newRole() {
        return new RoleBuilder();
    }

    private RoleBuilder() {
    }

    public RoleBuilder character(String character) {
        this.character = character;
        return this;
    }

    public RoleBuilder actor(Actor actor) {
        this.actor = actor;
        return this;
    }

    public Role build() {
        Role role = new Role();
        role.setCharacter(character);
        role.setActor(actor);
        return role;
    }

}
