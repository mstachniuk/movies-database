package liquibasedemo.data;

import javax.persistence.*;

@Entity
@Table(name = "user_rights")
public class UserRight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "description")
    private String description;

    private UserRight() {
        // For Hibernate
    }

    public UserRight(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRight userRight = (UserRight) o;

        if (description != null ? !description.equals(userRight.description) : userRight.description != null)
            return false;
        if (roleName != null ? !roleName.equals(userRight.roleName) : userRight.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleName != null ? roleName.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
