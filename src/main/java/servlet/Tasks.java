package servlet;

/**
 * Created by Администратор on 21.07.16.
 */
public class Tasks {
    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
